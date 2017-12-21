package first.sample.service;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import first.sample.dao.ReadBoardItemDAO;

@Service("readBoardItemService")
public class ReadBoardItemServiceImpl implements ReadBoardItemService {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="readBoardItemDAO")
	private ReadBoardItemDAO readBoardItemDAO;

	@Override
	public Map<String, Object> selectContents(String IDX, Map<String, Object> map) {
		return readBoardItemDAO.selectContents(IDX, map);
	}

}
