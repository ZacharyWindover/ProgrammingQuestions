
package hashing;

import java.util.Collection;

public class ChainingHashTable implements HashTable {
    
    

    private int hash(String key) {
        final int z = 33;

        int code = 0;
        int factor = 1;
        for (int i = 0; i < key.length(); i++) {
            code += key.charAt(i) * factor;
            factor *= z;
        }
        return Math.abs(code) % hashTable.length;
    }

	@Override
	public Student get(String key) {
		
	}

	@Override
	public Student put(String key, Student newValue) {
		
	}

	@Override
	public Collection<String> keySet() {
		
	}

}
