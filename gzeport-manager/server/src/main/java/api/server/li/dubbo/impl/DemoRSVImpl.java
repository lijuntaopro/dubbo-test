package api.server.li.dubbo.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;

import api.server.li.service.interfaces.DemoSV;
import api.service.li.dao.model.Demo;
import api.service.li.dao.model.DemoCriteria;
import api.service.li.dubbo.dto.DemoDTO;
import api.service.li.dubbo.dto.DemoReqDTO;
import api.service.li.dubbo.dto.DemoRespDTO;
import api.service.li.dubbo.interfaces.IDemoRSV;

import com.ai.ecp.server.front.dto.PageResponseDTO;

public class DemoRSVImpl implements IDemoRSV{
	@Resource
	private DemoSV demoSV;

	public long saveDemo(DemoDTO demo) throws DataAccessException {
		return demoSV.saveDemo(demo);
	}
	public int deleteDemo(Long id) throws DataAccessException {
		return demoSV.deleteDemo(id);
	}
	
	public DemoRespDTO queryDemoById(Long id) throws DataAccessException {
		return demoSV.queryDemoById(id);
	}
	
	public int updateDemo(DemoDTO record)
			throws DataAccessException {
		return demoSV.updateDemo(record);
	}
	
	public Long countByExample(DemoCriteria example) throws DataAccessException {
		return demoSV.countByExample(example);
	}

	public int deleteByExample(DemoCriteria example) throws DataAccessException {
		return demoSV.deleteByExample(example);
	}


	public int insert(Demo record) throws DataAccessException {
		return demoSV.insert(record);
	}
	
	
	public int insertSelective(Demo record) throws DataAccessException {
		return demoSV.insertSelective(record);
	}

	public List<Demo> selectByExample(DemoCriteria example)
			throws DataAccessException {
		return demoSV.selectByExample(example);
	}
	
	public PageResponseDTO<DemoRespDTO> queryDemo(DemoReqDTO demoReqDTO)
			throws DataAccessException {
		return demoSV.queryDemo(demoReqDTO);
	}


	public int updateByExampleSelective(Demo record, DemoCriteria example)
			throws DataAccessException {
		return demoSV.updateByExampleSelective(record, example);
	}

	public int updateByExample(Demo record, DemoCriteria example)
			throws DataAccessException {
		return demoSV.updateByExample(record, example);
	}


	public int updateByPrimaryKey(Demo record) throws DataAccessException {
		return demoSV.updateByPrimaryKey(record);
	}


}
