package com.ls.thread.threadpool;

public interface ThreadPool<Job extends Runnable> {
	
	// 执行一个Job,这个Job需要实现Runnable
	void execute(Job job);
	
	// 关闭线程池
	void shutDown();
	
	// 增加工作者线程
	void addWorker(int num);
	
	// 减少工作者线程
	void remoceWorker(int num);
	
	// 得到正在等待执行的任务数量
	int getJobSize();
}
