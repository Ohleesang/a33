package com.example.a33

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun findDiv(n : Int) :Int{
            var answer = 1 //1은 제외하고 계산
            for(i in 2..n){
                if(n%i==0) answer++
            }

            return answer
        }

        class Solution {
            fun solution(left: Int, right: Int): Int {
                var answer: Int = 0
                //약수가 몇개인지 파악하는 알고리즘이필요


                for(i in left..right){
                    if(findDiv(i)%2==0) answer += i
                    else answer -= i
                }
                return answer
            }
        }

        val a = Solution()
        a.solution(13,17)
        a.solution(24,27)
    }
}