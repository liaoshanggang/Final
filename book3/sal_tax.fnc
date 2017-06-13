create or replace function sal_tax(v_sal number) return number is
  Result number;
begin
  IF v_sal<2000 THEN
    RETURN 0.10;
    ELSIF v_sal<2750 THEN
      RETURN 0.15;
      ELSE
        RETURN 0.20;
        END IF;
  return(Result);
end sal_tax;
/
