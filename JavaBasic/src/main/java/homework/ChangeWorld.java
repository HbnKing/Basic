package homework;

import java.util.Arrays;


/**
 * 计算由相同 字母组成的单词
 * 输出结果为
 * pans	snap
 * pots	stop	tops
 * opt
 *
 */
public class ChangeWorld {
	

	
		public static void main(String[] args){
			String strings[] = {"pans","pots","opt","snap","stop","tops"};
			String[] str = new String[strings.length];
			char[] c = null;
			String s = null;
			for(int i=0; i<strings.length; i++){
				c = strings[i].toCharArray();
				Arrays.sort(c);
				str[i] = String.valueOf(c);
			}
			for(int i=0; i<strings.length-1; i++){
				for(int j=0; j<strings.length-i-1; j++){
					if(str[j].compareTo(str[j+1]) > 0){
						s = str[j];
						str[j] = str[j+1];
						str[j+1] = s;
						s = strings[j];
						strings[j] = strings[j+1];
						strings[j+1] = s;
					}
				}
			}
			s = str[0];
			System.out.print(strings[0]);
			for(int i=1; i<strings.length; i++){
				if(s.equals(str[i])){
					System.out.print("\t" + strings[i]);
				}else{
					System.out.print("\n" + strings[i]);    //�������Ⱦͻ������
				}
				s = str[i];
			}
		}
	}