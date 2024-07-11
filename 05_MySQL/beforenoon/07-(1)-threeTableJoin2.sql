-- 3개의 테이블 조인 
	-- 학생을 기준으로 학생 / 이름 / 지역/ 가입한 동아리 / 동아리방 정보 추출 
SELECT S.stbName, S.addr, SC.clubName, C.roomNo
	FROM stdtbl S
		INNER JOIN stdclubtbl SC
			ON S.stbName = SC.stdName
		INNER JOIN clubtbl C
			ON SC.clubName = C.clubName
	ORDER BY S.stbName;
    
    
	-- 동아리를 기준으로 강비한 학생의 목록 추출
SELECT C.clubName, C.roomNo, S.stbName, S.addr
	FROM stdtbl S
		INNER JOIN stdclubtbl SC
			ON SC.stbName = S.stdName
		INNER JOIN clubtbl C
			ON SC.clubName = C.clubName
	ORDER BY C.stbName;