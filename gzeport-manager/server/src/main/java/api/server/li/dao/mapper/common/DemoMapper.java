package api.server.li.dao.mapper.common;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import api.service.li.dao.model.Demo;
import api.service.li.dao.model.DemoCriteria;

public interface DemoMapper {
    Long countByExample(DemoCriteria example) throws DataAccessException;

    int deleteByExample(DemoCriteria example) throws DataAccessException;

    int deleteByPrimaryKey(Long id) throws DataAccessException;

    int insert(Demo record) throws DataAccessException;

    int insertSelective(Demo record) throws DataAccessException;

    List<Demo> selectByExample(DemoCriteria example) throws DataAccessException;

    Demo selectByPrimaryKey(Long id) throws DataAccessException;

    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoCriteria example) throws DataAccessException;

    int updateByExample(@Param("record") Demo record, @Param("example") DemoCriteria example) throws DataAccessException;

    int updateByPrimaryKeySelective(Demo record) throws DataAccessException;

    int updateByPrimaryKey(Demo record) throws DataAccessException;
}