package newcode.neicundiaodu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 实现简易内存池，根据请求命令完成内存分配和释放
 * 1.内存大小100
 * 2.分配必须连续，从低地址开始分配
 * 3.内存释放后可以再次被分配，但不能二次释放
 * 4.不会释放已申请的内存快的中间地址
 * 5.释放操作只是针对首地址对应的单位各内存块进行操作，不影响其他内存块
 *
 * EG1：
 * 2
 * REQUEST=10
 * REQUEST=20
 * 输出
 * 0
 * 10
 *
 * EG2：
 5
 REQUEST=10
 REQUEST=20
 RELEASE=0
 REQUEST=20
 REQUEST=10

 *
 * 0
 * 10
 * 30
 * 0
 *
 */
class Pair{
    int first;
    int second;
    boolean isTaken = false;
    public Pair(){

    }
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
    public int getFirst(){
        return this.first;
    }
    public void setFirst(int first){
        this.first = first;
    }
    public int getSecond(){
        return this.second;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public boolean isTaken(){
        return this.isTaken;
    }
    public void setTaken(boolean taken){
        this.isTaken = taken;
    }
}

class AllocateMenory {
    private int totalSize = 100;
    List<Pair> allocatedMenory = new ArrayList<>();
    AllocateMenory(){

    }
    int request(int size){
        if(size <= 0){
            return -1;
        }
        if(totalSize <= 0 || size > totalSize){
            return -1;
        }
        if(allocatedMenory.size() == 0){
            int address1 = 0;
            int address2 = size - 1;
            Pair memory0 = new Pair(address1, address2);
            memory0.isTaken = true;
            allocatedMenory.add(0, memory0);
            totalSize = totalSize - size;
            return address1;
        }else{
            for(int i = 0; i < allocatedMenory.size(); i++){
                boolean isTaken = allocatedMenory.get(i).isTaken;
                if(isTaken == true){
                    continue;
                }else{
                    int first = allocatedMenory.get(i).getFirst();
                    int second = allocatedMenory.get(i).getSecond();
                    int len = second - first + 1;
                    if(len == size){
                        allocatedMenory.get(i).setTaken(true);
                        totalSize = totalSize - size;
                        return first;
                    }
                }
            }
            int first = allocatedMenory.get(allocatedMenory.size() - 1).second + 1;
            int second = first + size - 1;
            Pair memoryLast = new Pair(first, second);
            memoryLast.setTaken(true);
            allocatedMenory.add(memoryLast);
            totalSize = totalSize - size;
        }
        return allocatedMenory.get(allocatedMenory.size() - 1).first;
    }

    boolean release(int startAddress){
        for(int i = 0; i < allocatedMenory.size(); i++){
            int first = allocatedMenory.get(i).first;
            if(first == startAddress){
                allocatedMenory.get(i).setTaken(false);
                return true;
            }
        }
        return false;
    }
}
