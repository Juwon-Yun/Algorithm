package Example;


public class Refactoring {
	/*
		Controller ( 가능, 확장성 고려하여 ServiceImple에 구현함 )
			- @Autowired Mapper ???
			- 어떤 로직을 구성 ???`
				- 1. 파라미터 조회 ( Request, Session, 환경변수 (System.getProperty("")), ...)
				- 2. 주요 파라미터 검증 
				- 3. 서비스 로직 처리 ( 2개 이상 사용 ???, Service는 1개의 트렌젝션의 단위이다. )
				    => 트렌젝션 단위로 서비스 구성되어야 함. ( 트렌젝션의 단위는 서비스로 구성해야 한다 )
						- 서비스 전달 파라미터 구성 ( Map --> ParamMap )
						- 서비스 호출 
				- 4. 클라이언트 전달자료 구성, 화면 설정

@Transactional
XML

		Service / Service Impl
			- 서비스에서 다른 서비스를 호출할 수 있음
				- 트렌젝션 유지 ? -> propagation
					- 기본의 서비스가 사용하는 Connection 유지
				1. 기존의 서비스가 가지고 있는 Connection을 유지하거나 없으면 새로 생성해서 사용
						( Required )
				2. 무조건 생성해서 사용 ( Required_New )
				3. 없으면 오류를 뱉어냄

				컨트롤러 ==(호출)=> 서비스 1 ====> 서비스 2, 서비스 3 (Service 함수 별로 따로):

		Mapper / DAO / XML  => Mabatis : 구현 체 ??? : interface로만 사용 @Mapper
			-


	 */


}
