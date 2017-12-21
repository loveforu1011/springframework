package first.sample.dao;

import java.util.Map;

public interface ReadBoardItemDAO {

	Map<String, Object> selectContents(String IDX, Map<String, Object> map);
		
}
