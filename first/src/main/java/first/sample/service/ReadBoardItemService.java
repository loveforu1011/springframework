package first.sample.service;

import java.util.Map;

public interface ReadBoardItemService {

	Map<String, Object> selectContents(String IDX, Map<String, Object> commandMap);

}
