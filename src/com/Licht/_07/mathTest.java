package com.Licht._07;

public class mathTest {
	public static void main(String[] args)
	{
		//为简化，本段并未输出
		/*---以下是三角运算---*/
		//将弧度转化成角度
		Math.toDegrees(1.57);
		//将角度转换成弧度
		Math.toRadians(90);
		//计算反余弦值，返回的角度范围在0.0到pi之间
		Math.acos(1.2);
		//计算反正弦值，返回的角度在-pi/2到pi/2之间
		Math.asin(0.8);
		//计算反正切值，返回的角度在-pi/2到pi/2之间
		Math.atan(2.3);
		//计算余弦
		Math.cos(1.57);
		//计算双曲余弦
		Math.cosh(1.2);
		//计算正弦
		Math.sin(1.57);
		//计算双曲正弦
		Math.sinh(1.2);
		//计算正切
		Math.tan(0.8);
		//计算双曲正切
		Math.tanh(2.1);
		//将二维坐标(x,y)转换成极坐标(r,thet)
		Math.atan2(0.1, 0.2);
		/*---以下是取整运算---*/
		//取整，返回小于目标数的最大整数
		Math.floor(-1.2);
		//取整，返回大于目标数的最小整数
		Math.ceil(1.2);
		//四舍五入取整
		Math.round(2.3);
		//计算平方根
		Math.sqrt(2.3);
		//计算立方根
		Math.cbrt(9);
		//返回欧拉数e的n次幂
		Math.exp(2);
		//返回sqrt(x2+y2)，没有中间溢出或下溢
		Math.hypot(4, 4);
		//按照IEEE 754的规定，对两个参数进行余数运算
		Math.IEEEremainder(5, 2);
		//计算乘方
		Math.pow(3,2);
		//计算自然对数
		Math.log(12);
		//计算底数为10的对数
		Math.log10(9);
		//返回参数与1之和的自然对数
		Math.log1p(9);
		/*---以下是符号相关的运算---*/
		//计算绝对值
		Math.abs(-4.5);
		//符号赋值，返回带有第二个浮点数符号的第一个浮点参数
		Math.copySign(1.2,-1.0);
		//符号函数，如果参数为0，则返回0；如果参数大于0，则返回1.0；
		//如果参数小于0，则返回-1.0
		Math.signum(2.3);;
		/*---下面是大小相关的运算---*/
		//找出最大值
		Math.max(2.3, 4.5);
		//找出最小值
		Math.min(1.2, 3.4);
		//返回第一个参数和第二个参数相邻的浮点数
		Math.nextAfter(1.2, 1.0);
		//返回比目标数略大的浮点数
		Math.nextUp(1.2);
		//返回一个伪随机数，该值大于等于0.0且小于1.0
		Math.random();
	}
}
