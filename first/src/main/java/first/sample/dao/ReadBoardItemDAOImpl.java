package first.sample.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("readBoardItemDAO")
public class ReadBoardItemDAOImpl extends AbstractDAO implements ReadBoardItemDAO {

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> selectContents(String IDX, Map<String, Object> map) {
		return (Map<String, Object>)selectOne("sample.readBoardItem", IDX);
	}
}
