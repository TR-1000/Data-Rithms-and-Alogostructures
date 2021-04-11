Chapter 4 ■ Methods and Encapsulation

---
##### 1. Which of the following can fill in the blank in this code to make it compile? (Choose all that apply)
```
public class Ant {
 _____ void method() { }
}
A. default
B. final
C. private
D. Public
E. String
F. zzz:
```
B, C. void is a return type. Only the access modifier or optional specifiers are allowed
before the return type. Option C is correct, creating a method with private access.
Option B is correct, creating a method with default access and the optional specifier
final. Since default access does not require a modifier, we get to jump right to final.

---
##### 2. Which of the following compile? (Choose all that apply)
```
A. final static void method4() { }
B. public final int void method() { }
C. private void int method() { }
D. static final void method3() { }
E. void final method() {}
F. void public method() { }
```
A, D. Options A and D are correct because the optional specifiers are allowed in any
order. Options B and C are incorrect because they each have two return types. Options
E and F are incorrect because the return type is before the optional specifier and access
modifier, respectively.

---
##### 3. Which of the following methods compile? (Choose all that apply)
```
A. public void methodA() { return;}
B. public void methodB() { return null;}
C. public void methodD() {}
D. public int methodD() { return 9;}
E. public int methodE() { return 9.0;}
F. public int methodF() { return;}
G. public int methodG() { return null;}
```
A, C, D. Options A and C are correct because a void method is allowed to have a
return statement as long as it doesn’t try to return a value. Options B and G do not
compile because null requires a reference object as the return type. void is not a reference object since it is a marker for no return type. int is not a reference object since it
is a primitive. Option D is correct because it returns an int value. Option E does not
compile because it tries to return a double when the return type is int. Since a double
cannot be assigned to an int, it cannot be returned as one either. Option F does not
compile because no value is actually returned.

---
##### 4. Which of the following compile? (Choose all that apply)

```
A. public void moreA(int... nums) {}
B. public void moreB(String values, int... nums) {}
C. public void moreC(int... nums, String values) {}
D. public void moreD(String... values, int... nums) {}
E. public void moreE(String[] values, ...int nums) {}
F. public void moreF(String... values, int[] nums) {}
G. public void moreG(String[] values, int[] nums) {}
```
A, B, G. Options A and B are correct because the single vararg parameter is the last
parameter declared. Option G is correct because it doesn’t use any vararg parameters
at all. Options C and F are incorrect because the vararg parameter is not last. Option
D is incorrect because two vararg parameters are not allowed in the same method.
Option E is incorrect because the ... for a vararg must be after the type, not before it.

---
##### 5. Given the following method, which of the method calls return 2? (Choose all that apply)
```
public int howMany(boolean b, boolean... b2) {
 return b2.length;
}
A. howMany();
B. howMany(true);
C. howMany(true, true);
D. howMany(true, true, true);
E. howMany(true, {true});
F. howMany(true, {true, true});
G. howMany(true, new boolean[2]);
```

D, G. Option D passes the initial parameter plus two more to turn into a vararg array
of size 2. Option G passes the initial parameter plus an array of size 2. Option A does
not compile because it does not pass the initial parameter. Options E and F do not
compile because they do not declare an array properly. It should be new boolean[]
{true}. Option B creates a vararg array of size 0 and option C creates a vararg array of
size 1.

---
##### 6. Which of the following are true? (Choose all that apply)
```
A. Package private access is more lenient than protected access.
B. A public class that has private fields and package private methods is not visible to
classes outside the package.
C. You can use access modifiers so only some of the classes in a package see a particular
package private class.
D. You can use access modifiers to allow read access to all methods, but not any instance
variables.
E. You can use access modifiers to restrict read access to all classes that begin with the
word Test.
```
D. Option D is correct. This is the common implementation for encapsulation by setting all fields to be private and all methods to be public. Option A is incorrect because
protected access allows everything that package private access allows and additionally
allows subclasses access. Option B is incorrect because the class is public. This means
that other classes can see the class. However, they cannot call any of the methods or
read any of the fields. It is essentially a useless class. Option C is incorrect because
package private access applies to the whole package. Option E is incorrect because Java
has no such capability.

---
##### 7. Given the following my.school.ClassRoom and my.city.School class definitions, which line numbers in main() generate a compiler error? (Choose all that apply)
```
1: package my.school;
2: public class Classroom {
3: private int roomNumber;
4: protected String teacherName;
5: static int globalKey = 54321;
6: public int floor = 3;
7: Classroom(int r, String t) {
8: roomNumber = r;
9: teacherName = t; } }

1: package my.city;
2: import my.school.*;
3: public class School {
4: public static void main(String[] args) {
5: System.out.println(Classroom.globalKey);
6: Classroom room = new Classroom(101, ""Mrs. Anderson");
7: System.out.println(room.roomNumber);
8: System.out.println(room.floor);
9: System.out.println(room.teacherName); } }
```
B, C, D, F. The two classes are in different packages, which means private access and
default (package private) access will not compile. Additionally, protected access will
not compile since School does not inherit from Classroom. Therefore, only line 8 will
compile because it uses public access.
