package api.service.li.dubbo.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import com.ai.ecp.server.front.dto.PageResponseDTO;

import api.service.li.dao.model.Demo;
import api.service.li.dao.model.DemoCriteria;
import api.service.li.dubbo.dto.DemoDTO;
import api.service.li.dubbo.dto.DemoReqDTO;
import api.service.li.dubbo.dto.DemoRespDTO;

public interface IDemoRSV {
	public long saveDemo(DemoDTO demo) throws DataAccessException;
	int updateDemo(DemoDTO record) throws DataAccessException;
	int deleteDemo(Long id) throws DataAccessException;
	DemoRespDTO queryDemoById(Long id) throws DataAccessException;

	PageResponseDTO<DemoRespDTO> queryDemo(DemoReqDTO demoReqDTO) throws DataAccessException;
	
	Long countByExample(DemoCriteria example) throws DataAccessException;

    int deleteByExample(DemoCriteria example) throws DataAccessException;

    int insert(Demo record) throws DataAccessException;
    
    int insertSelective(Demo record) throws DataAccessException;

    List<Demo> selectByExample(DemoCriteria example) throws DataAccessException;
    

    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoCriteria example) throws DataAccessException;

    int updateByExample(@Param("record") Demo record, @Param("example") DemoCriteria example) throws DataAccessException;
    

    int updateByPrimaryKey(Demo record) throws DataAccessException;
}
