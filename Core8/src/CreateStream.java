import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		
		
		Stream<Integer> stream = Stream.of(1,2,3,4);
		Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4}); 
		System.out.println("skip(long n) :"+stream1.skip(1).collect(Collectors.toList()));
		System.out.println("skip(long n) :"+stream1.skip(1).collect(Collectors.toList()));
		//works fine

		//Stream<Integer> stream2 = Stream.of(new int[]{1,2,3,4}); 
		//Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer>

		
		//We can use Collection stream() to create sequential stream and parallelStream() to create parallel stream
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
				
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
				
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//We can use Stream.generate() and Stream.iterate() methods to create Stream.
		

		Stream<String> stream2 = Stream.generate(() -> {return "abc";});
		Stream<String> stream3 = Stream.iterate("abc", (i) -> i);
		
		//Using Arrays.stream() and String.chars() methods.
		

		LongStream is = Arrays.stream(new long[]{1,2,3,4});
		IntStream is2 = "abc".chars();
		
		//
	}

}
