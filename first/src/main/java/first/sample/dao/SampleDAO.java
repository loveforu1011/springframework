package first.sample.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) {
		int perpage = 5;
		int page = 1;
		if(map.get("pageid") != null)
			page = Integer.parseInt(map.get("pageid").toString());
		int startcnt = page * perpage - 4;
		int endcnt = page * perpage;
		map.put("startcnt", startcnt);
		map.put("endcnt", endcnt);
		List<Map<String, Object>> temp = (List<Map<String, Object>>)selectList("sample.selectBoardList",map);
		Map pagemap = new HashMap();
		pagemap.put("pageid", page);
		int totalpagecnt = Integer.parseInt(selectOne("sample.selectTotalCount").toString()) / perpage;
		pagemap.put("totalpagecnt", totalpagecnt);
		
		temp.add(pagemap);
		return temp;
	}

}