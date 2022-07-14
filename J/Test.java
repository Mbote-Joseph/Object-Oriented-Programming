// // Copyright 2022 user
// // 
// // Licensed under the Apache License, Version 2.0 (the "License");
// // you may not use this file except in compliance with the License.
// // You may obtain a copy of the License at
// // 
// //     http://www.apache.org/licenses/LICENSE-2.0
// // 
// // Unless required by applicable law or agreed to in writing, software
// // distributed under the License is distributed on an "AS IS" BASIS,
// // WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// // See the License for the specific language governing permissions and
// // limitations under the License.

// public class Test {
//     public static void main(String[] args) {
//         Count c = new Count();
//         int times= 0;

//         for(int i=0; i<100; i++) {
//             increment(c, times);

//             System.out.println("Count: " + c.getCount());
//             System.out.println("times: " + times);
//         }
        

//          increment(Count c, int times) {
//             c.inc();
//             times++;
//         }
//     }
// }

// public class Test{
//     public static void main(String[] args) {
//         Count c = new Count();
//         int times= 0;

//         for(int i=0; i<100; i++) {
//             increment(c, times);

//             System.out.println("Count: " + c.getCount());
//             System.out.println("times: " + times);
//         }
//     }
    
//     public static void increment(Count c, int times) {
//         c.inc();
//         times++;
//     }
// }

// public class Test{
//     public static void main(String[] args) {
//          A a = new A(3);
        
//     }

    
    
    
// }

// class A extends B {
//     public A(int t) {
//         System.out.println("A's constructor is invoked");
//     }
// }

// class B {
//     public B() {
//         System.out.println("B's constructor is invoked");
//     }
// }

public class Test{
    public static void main(String[] args) {
        B b = new B();
        b.m(5);
        System.out.println("i is: " + b.i);

    }
}

class A{
    int i;
    public void m(int i) {
        this.i = i;
    }

}

class B extends A{
    public void m(String s){}
}