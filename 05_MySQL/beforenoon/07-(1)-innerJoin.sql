USE employees;

SELECT count(*) FROM  dept_emp  -- 직원이 어느 부서에 배정됐느냐 / count(*) : 직원 수
-- WHERE to_date = '9999-01-01'; -- 현재 재직자 찾기 
WHERE to_date = '9999/01/01'; -- 위와 동일 로직.


USE sqldb; 
SELECT * FROM buytbl
		INNER JOIN usertbl -- inner join은 두 테이블의 위치를 바꿔도 동일한 결과를 출력한다. 
			ON buytbl.userID = usertbl.userID
-- 		WHERE buytbl.userID = 'JYP'; 
 		WHERE buytbl.userID = 'KBS'; 
        
        
-- 위와 동일한 결과 as를 사용하여 가독성을 높임 
USE sqldb; 
SELECT u.userID, b.prodName, u.addr 
	FROM buytbl as b
		INNER JOIN usertbl as u -- inner join은 두 테이블의 위치를 바꿔도 동일한 결과를 출력한다. 
			ON b.userID = u.userID
 		WHERE b.userID = 'KBS'; 
        
        
        
