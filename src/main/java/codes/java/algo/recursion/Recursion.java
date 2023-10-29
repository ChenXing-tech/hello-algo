package codes.java.algo.recursion;

import com.google.common.base.Stopwatch;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/11
 * @description 递归
 */
public class Recursion {

  public static void main(String[] args) {
    Stopwatch stopwatch = Stopwatch.createStarted();
    int i = iterationAdd(100);
    int j = recurAdd(100);
    System.out.println(j);
    stopwatch.stop();
    System.out.printf("执行时长：%d 豪秒.", stopwatch.elapsed(TimeUnit.MILLISECONDS));

  }

  /**
   * 迭代相加 1-n
   */
  public static int iterationAdd(int n){
    int res = 0;
    for (int i = 0; i <= n; i++){
      res += i;
    }
    return res;
  }

  /**
   * 递归相加 1-n
   */
  public static int recurAdd(int n){
    // 归: 终止条件
    if (n == 1){
      return 1;
    }
    // 递: 将问题分为若干子问题
    int res = recurAdd(n - 1);
    // 归: 返回结果
    return res + n;
  }

  /**
   *  尾递归
   *  函数返回前的最后一步才进行递归调用，该函数可以被编译器或解释器优化，使其效率与迭代效率相当
   */
  public static int tailRecurAdd(int n, int res){
    // 归: 终止条件
    if (n == 0){
      return res;
    }
    return tailRecurAdd(n - 1, res + n);
  }

  /**
   * 给定一个斐波那契数列 0，1，1，2，3，5，8，13，求该数列的第n个数字
   */
  public static int fib(int n){
    if (n == 1 || n == 2){
      return n - 1;
    }
    return fib(n - 2) + fib( n - 1 );
  }

  /**
   * 扩展递归和栈之间的关系
   * 可以用显式的堆栈模拟调用关系
   */
  public static int forLoopRecur(int n ){
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i <=n; i++) {
      stack.push(i);
    }
    int res = 0;
    while (!stack.isEmpty()){
      res += stack.pop();
    }
    return res;
  }
}
