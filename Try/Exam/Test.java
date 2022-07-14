// Copyright 2022 user
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//     http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.




// public class Test {
//     public static void main(String[] args) {
//         B b=new B();
//         b.m(5);
//         System.out.println("i is "+b.i);
//     }
// }

// class A{
//     int i;

//     public void m(int i){
//         this.i = i;
//     }
// }

// class B extends A{
//     public void m(String s){
    
//     }
// }
package Exam;

import java.util.*;



public class Test{
    public static void main(String[] args){
        Date d1 = new Date();
        Date d2 = new Date(349324);
        Date d3=d1;
        System.out.println("(1)"+(d1==d2));
        System.out.println("(2)"+(d1==d3));
        System.out.println("(3)"+(d1.equals(d2)));
        System.out.println("(4)"+(d1.equals(d3)));

        
    }
}