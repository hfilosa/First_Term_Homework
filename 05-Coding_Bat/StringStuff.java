public class StringStuff {

//nonStart

public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}

//makeAbba

public String makeAbba(String a, String b) {
  return a+b+b+a;
}

//diff21

public int diff21(int n) {
  if (n>21) { return 2*(n-21);}
  else if (n>=0) {return 21-n;}
  else {return (-1*n)+21;}
}

}
