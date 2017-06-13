create or replace procedure p1(v_a in number,v_b number,v_ret out number,v_temp in out number) is
begin
  IF(v_a>v_b) THEN
    v_ret:=v_a;
  ELSE
    v_ret:=v_b;
  END IF;
  v_temp:=v_temp+1;
end p1;
DECLARE
v_a NUMBER;
v_b NUMBER;
v_ret NUMBER;
v_temp NUMBER:=5;
BEGIN
  p1(&v_a的值,&v_b的值,v_ret,v_temp)
  dbms_output,put_line(v_ret);
  dbms_output.put_line(v_temp);
END;
/
