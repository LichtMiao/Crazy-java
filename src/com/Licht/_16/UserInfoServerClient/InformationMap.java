package com.Licht._16.UserInfoServerClient;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
/*
*使用Map保存用户和对应Socket(或对应输出流)之间的映射关系
*/
public class InformationMap<K, V>{
	//创建一个线程安全的HashMap
	public Map<K, V> map = Collections.synchronizedMap(new HashMap<K, V> ());
	//删除value值重复的项
	//同步方法，非static的方法的同步监视器为this，即调用该方法的对象
	public synchronized void removeByValue(Object value){
		for (Object key : map.keySet()){
			if(map.get(key) == value){
				map.remove(key);
				break;
			}
		}
	}
	//获取所有的value组成的Set集合
	public synchronized Set<V> valueSet(){
		Set<V> result = new HashSet<V>();
		//将map中的所有value添加到result集合中
		map.forEach((key, value) -> result.add(value));
		return result;
	}
	//根据value查找key值
	public synchronized K getKeyByValue(V val){
		//遍历所有key组成的集合
		for (K key : map.keySet()){
			if (map.get(key) == val || map.get(key).equals(val)){
				return key;
			}
		}
		return null;
	}	
	//实现put()方法，不允许value值重复
	public synchronized V put(K key, V value){
		for (V val : valueSet()){
			//如果试图放入的value值与集合中value值相同，
			//则抛出一个RuntimeException异常
			if (val.equals(value) && val.hashCode() == value.hashCode()){
				throw new RuntimeException("实例中不允许有value值重复");
			}
		}
		return map.put(key, value);
	}
}