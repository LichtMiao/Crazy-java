package com.Licht._07;

public class mathTest {
	public static void main(String[] args)
	{
		//Ϊ�򻯣����β�δ���
		/*---��������������---*/
		//������ת���ɽǶ�
		Math.toDegrees(1.57);
		//���Ƕ�ת���ɻ���
		Math.toRadians(90);
		//���㷴����ֵ�����صĽǶȷ�Χ��0.0��pi֮��
		Math.acos(1.2);
		//���㷴����ֵ�����صĽǶ���-pi/2��pi/2֮��
		Math.asin(0.8);
		//���㷴����ֵ�����صĽǶ���-pi/2��pi/2֮��
		Math.atan(2.3);
		//��������
		Math.cos(1.57);
		//����˫������
		Math.cosh(1.2);
		//��������
		Math.sin(1.57);
		//����˫������
		Math.sinh(1.2);
		//��������
		Math.tan(0.8);
		//����˫������
		Math.tanh(2.1);
		//����ά����(x,y)ת���ɼ�����(r,thet)
		Math.atan2(0.1, 0.2);
		/*---������ȡ������---*/
		//ȡ��������С��Ŀ�������������
		Math.floor(-1.2);
		//ȡ�������ش���Ŀ��������С����
		Math.ceil(1.2);
		//��������ȡ��
		Math.round(2.3);
		//����ƽ����
		Math.sqrt(2.3);
		//����������
		Math.cbrt(9);
		//����ŷ����e��n����
		Math.exp(2);
		//����sqrt(x2+y2)��û���м����������
		Math.hypot(4, 4);
		//����IEEE 754�Ĺ涨������������������������
		Math.IEEEremainder(5, 2);
		//����˷�
		Math.pow(3,2);
		//������Ȼ����
		Math.log(12);
		//�������Ϊ10�Ķ���
		Math.log10(9);
		//���ز�����1֮�͵���Ȼ����
		Math.log1p(9);
		/*---�����Ƿ�����ص�����---*/
		//�������ֵ
		Math.abs(-4.5);
		//���Ÿ�ֵ�����ش��еڶ������������ŵĵ�һ���������
		Math.copySign(1.2,-1.0);
		//���ź������������Ϊ0���򷵻�0�������������0���򷵻�1.0��
		//�������С��0���򷵻�-1.0
		Math.signum(2.3);;
		/*---�����Ǵ�С��ص�����---*/
		//�ҳ����ֵ
		Math.max(2.3, 4.5);
		//�ҳ���Сֵ
		Math.min(1.2, 3.4);
		//���ص�һ�������͵ڶ����������ڵĸ�����
		Math.nextAfter(1.2, 1.0);
		//���ر�Ŀ�����Դ�ĸ�����
		Math.nextUp(1.2);
		//����һ��α���������ֵ���ڵ���0.0��С��1.0
		Math.random();
	}
}