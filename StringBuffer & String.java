/*StringBuffer class is used to create a mutable string object.
 It represents grow-able and write-able character sequence. 
 As we know that String objects are immutable, so if we do a lot of changes with String objects,
 we will end up with a lot of memory leak.
 */

class sample {
 public static void main(String args[])
 {
  String str = "study";
  str.concat("tonight");
  System.out.println(str);      // Output: study

  StringBuffer strB = new StringBuffer("study");
  strB.append("tonight");
  System.out.println(strB);    // Output: studytonight
 }
}
