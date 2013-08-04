import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class _CrivoTest {

	@Test public void return2for2(){
		assertThat(Crivo.primes(2)).containsOnly(2);
	}
	
	@Test public void return2and3for3(){
		assertThat(Crivo.primes(3)).containsOnly(2,3);
	}
	
	@Test public void eliminatesDivisibleNumbers(){
		assertThat(Crivo.primes(4)).containsOnly(2,3);
		assertThat(Crivo.primes(9)).containsOnly(2,3,5,7);
		assertThat(Crivo.primes(30)).containsOnly(2, 3, 5, 7, 11, 13, 17, 19, 23 , 29);
	}
	
}
