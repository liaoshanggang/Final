create or replace function func(num_in number) return INTEGER is
  Result INTEGER;
begin
  IF MOD(num_in,5)=0 THEN
  RETURN 1;
  ELSE
    RETURN -1;
    END IF;
    EXCEPTION
      WHEN OTHERS THEN RETURN -1;
  return(Result);
end func;
/
