import com.encore.mvc.controller.InsertController;
import com.encore.mvc.domain.PostRequestDto;

public class MvcMain {

	public static void main(String[] args) {
		
		// 사용자의 입력화면을 통해서 게시글 작성을 요청하는 영역
		InsertController insert = new InsertController() ;
		
		// 사용자가 입력한 값을 dto에 담아서 ctroller 전달
		PostRequestDto params = new PostRequestDto();
		params.setTitle("불금");
		params.setContent("간호해야함");
		params.setWriter("섭섭해"); 
		
		int flag = insert.execute(params); 
		
		System.out.println(">>>> insert Result : " + flag); 
		
	}

}



