package api.server.li.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import api.server.li.dao.mapper.common.DemoMapper;
import api.server.li.service.interfaces.DemoSV;
import api.service.li.dao.model.Demo;
import api.service.li.dao.model.DemoCriteria;
import api.service.li.dao.model.DemoCriteria.Criteria;
import api.service.li.dubbo.dto.DemoDTO;
import api.service.li.dubbo.dto.DemoReqDTO;
import api.service.li.dubbo.dto.DemoRespDTO;

import com.ai.ecp.frame.sequence.PaasSequence;
import com.ai.ecp.frame.vo.BaseCriteria;
import com.ai.ecp.server.front.dto.PageResponseDTO;
import com.ai.ecp.server.service.impl.GeneralSQLSVImpl;
import com.ai.ecp.server.service.pagination.PaginationCallback;
@Service("demoSV")
public class DemoSVImpl extends GeneralSQLSVImpl implements DemoSV{
//	@Resource(name="seq_demo_id")
	private PaasSequence seqDemo;
	@Resource
	private DemoMapper demoMapper;

	public int updateDemo(DemoDTO record)
			throws DataAccessException {
		Demo demo = new Demo();
		BeanUtils.copyProperties(record, demo);
		return demoMapper.updateByPrimaryKeySelective(demo);
	}
	
	public long saveDemo(DemoDTO demoDTO) throws DataAccessException {
		Demo demo = new Demo();
		BeanUtils.copyProperties(demoDTO, demo);
		Long value = seqDemo.nextValue();
		System.out.println("生成id:"+value);
		demo.setId(value);
		demoMapper.insert(demo);
		return demo.getId();
	}
	
	public DemoRespDTO queryDemoById(Long id) throws DataAccessException {
		Demo demo = demoMapper.selectByPrimaryKey(id);
		DemoRespDTO respDTO = new DemoRespDTO();
		BeanUtils.copyProperties(demo, respDTO);
		return respDTO;
	}
	
	public int deleteDemo(Long id) throws DataAccessException {
		return demoMapper.deleteByPrimaryKey(id);
	}
	
	public PageResponseDTO<DemoRespDTO> queryDemo(DemoReqDTO dto) throws DataAccessException{
		//创建一个条件器对象
		DemoCriteria demoCriteria=new DemoCriteria();
//		List<Criteria> criteriaList = demoCriteria.getOredCriteria();
		Criteria criteria = demoCriteria.createCriteria();
		
		if (StringUtils.isNotEmpty(dto.getEntname())) {
			criteria.andEntnameLike("%"+dto.getEntname()+"%");		 
		}
		if(dto.getId()!=null){
			criteria.andIdEqualTo((long)dto.getId().intValue());
		}
		if (StringUtils.isNotEmpty(dto.getOrgcode())) {
			criteria.andOrgcodeLike("%"+dto.getEntname()+"%");
		}
		demoCriteria.setLimitClauseStart(dto.getStartRowIndex());
		demoCriteria.setLimitClauseCount(dto.getPageSize());
		demoCriteria.setOrderByClause("id ASC");
		return super.queryByPagination(dto, demoCriteria, false, new PaginationCallback<Demo,DemoRespDTO>() {

			@Override
			public List<Demo> queryDB(BaseCriteria criteria) {
				return demoMapper.selectByExample((DemoCriteria)criteria);
			}

			@Override
			public long queryTotal(BaseCriteria criteria) {
				return demoMapper.countByExample((DemoCriteria)criteria);
			}

			@Override
			public DemoRespDTO warpReturnObject(Demo demo) {
				DemoRespDTO dto=new DemoRespDTO();
				BeanUtils.copyProperties(demo, dto);
				return dto;
			}
		});
	}
	
	public Long countByExample(DemoCriteria example) throws DataAccessException {
		return demoMapper.countByExample(example);
	}

	public int deleteByExample(DemoCriteria example) throws DataAccessException {
		return demoMapper.deleteByExample(example);
	}

	public int insert(Demo record) throws DataAccessException {
		return demoMapper.insert(record);
	}
	

	public int insertSelective(Demo record) throws DataAccessException {
		return demoMapper.insertSelective(record);
	}

	public List<Demo> selectByExample(DemoCriteria example)
			throws DataAccessException {
		return demoMapper.selectByExample(example);
	}

	public int updateByExampleSelective(Demo record, DemoCriteria example)
			throws DataAccessException {
		return demoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Demo record, DemoCriteria example)
			throws DataAccessException {
		return demoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKey(Demo record) throws DataAccessException {
		return demoMapper.updateByPrimaryKey(record);
	}

}
