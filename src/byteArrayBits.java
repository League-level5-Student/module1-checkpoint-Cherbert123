
public class byteArrayBits {
	public static void main(String[] args) {
		byte[] arr = new byte[10];
		arr[0] = 0b00000101;
		arr[1] = 0b00000101;
		arr[2] = 0b00001110;
		arr[3] = 12;
		byteArrayBits runner = new byteArrayBits();
		runner.getbitsFromArray(arr, 10, 5);
	}

	public int getbitsFromArray(byte[] array, int offset, int bits) {
		int byteOffset = offset / 8;
		int bitOffset = offset % 8;

		int res = 0;

		for (int i = 0; i < bits; i++) {
			byte current = array[byteOffset];
			byte bit = (byte) (current & (1 << bitOffset));

			res = res | bit;

			bitOffset++;
			if (bitOffset > 8) {
				byteOffset++;
				bitOffset = 0;
			}
		}
		System.out.println(res);
		return res;
	}
}
