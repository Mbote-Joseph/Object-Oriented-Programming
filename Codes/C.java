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

package Codes;

public class C {
    public static void main(String[] args) {
        Object[] o= {new A(), new B()};
        System.out.print(o[0]);
        System.out.print(o[1]);
    } 
}

class A extends B{
    public String toString(){
        return "A";
    }
}

class B{
    public String toString(){
        return "B";
    }
}
