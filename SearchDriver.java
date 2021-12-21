/**
YAH:: Ameer Alnasser + TurtleBoi, Hugo Jenkins + Boary
APCS pd6
Lab03:: Search
2021-12-20
**/


public class SearchDriver {
  long[] binTimes = new long[20];
  long[] linTimes = new long[20];
  long avgTime;
  long startTime;
  long endTime;
  Comparable[] community;

  public void test() {
    for (int u = 1; u <= 20; u ++) {
      community = new Comparable[(int)u * 2_500_000];
      populate(community);
      startTime = System.currentTimeMillis();
      test2Bin();
      endTime = System.currentTimeMillis();
      System.out.println("Done with Bin " + u);
      avgTime = (endTime - startTime);
      binTimes[u-1] = avgTime;
      startTime = System.currentTimeMillis();
      test2Lin();
      endTime = System.currentTimeMillis();
      System.out.println("Done with Lin " + u);
      avgTime = (endTime - startTime);
      linTimes[u-1] = avgTime * (community.length / 100);
    }
  }

  public void test2Bin() {
    for (int e = 0; e < community.length; e++) {
      BinSearch.binSearch(community, e);
    }
  }

  public void test2Lin() {
    for (double e = 0.00; e <= 1.00; e+=.01) {
      LinSearch.linSearch(community,(int) (community.length*e));
    }

    //for (int e = 0; e < (int)(community.length/1_000_000); e++) { // looking at every index and one extraneous
    //  LinSearch.linSearch(community, e);
    //}
  }

/*
  public long avg(long[] arr) {
    long sum = 0;
    for (long a : arr) {
      sum += a;
    }
    return sum;
  }
*/
  public void populate(Comparable[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
  }

  public String arrayToString(long[] arr) {
    String s = "[";
    for (long a : arr) {
      s += a +", ";
    }
    return s.substring(0,s.length()-2) + "]";
  }


  public static void main(String[] args) {
    SearchDriver bob = new SearchDriver();
    bob.test();
    System.out.println(bob.arrayToString(bob.binTimes));
    System.out.println(bob.arrayToString(bob.linTimes));
  }
}
