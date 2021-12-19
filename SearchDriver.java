public class SearchDriver {
  long[] binTimes = new long[20];
  long[] linTimes = new long[20];
  long avgTime;
  long startTime;
  long endTime;
  Comparable[] community;

  public void test() {
    for (int u = 1; u <= 20; u ++) {
      community = new Comparable[(int)u * 4_000_000];
      populate(community);
      startTime = System.currentTimeMillis();
      test2Bin();
      endTime = System.currentTimeMillis();
      avgTime = (endTime - startTime);
      binTimes[u-1] = avgTime;
      startTime = System.currentTimeMillis();
      test2Lin();
      endTime = System.currentTimeMillis();
      avgTime = (endTime - startTime);
      linTimes[u-1] = avgTime;
    }
  }

  public void test2Bin() {
    for (int e = 0; e < community.length + 1; e++) { // looking at every index and one extraneous
      BinSearch.binSearch(community, e);
    }
  }

  public void test2Lin() {
    for (int e = 0; e < community.length + 1; e++) { // looking at every index and one extraneous
      LinSearch.linSearch(community, e);
    }
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
