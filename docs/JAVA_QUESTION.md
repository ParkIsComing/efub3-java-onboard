# 자바 핵심 개념 정리
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
<p>원시타입으로는 boolean, byte, short, int, long, float, double, char가 있다. 각각의 원시타입이 차지하는 바이트 수는 다음과 같다.</p>
<ul>
<li>boolean: 1byte</li>
<li>byte: 1 byte</li>
<li>short: 2 byte</li>
<li>int: 4 byte</li>
<li>long: 8 byte</li>
<li>float: 4 byte</li>
<li>double: 8 byte</li>
<li>char: 2 byte</li>
</ul>
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
<p>자바에서는 오버라이딩과 오버로딩을 통해 다형성을 지원한다.</p>
<ul>
<li>오버 로딩은 같은 이름의 메서드 여러 개를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술이다.</li>
<li>오버 라이딩은 상위 클래스가 가지고 있는 메서드를 하위 클래스가 재정의해서 사용하는 기술이다. 상속에서 주로 사용된다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
<p>OOP의 가장 큰 특징은 세가지이다.</p>
<ul>
<li>캡슐화<ul>
<li>연관된 데이터와 함수를 클래스로 묶는 것이다.</li>
<li>캡슐화를 이용하여 응집도는 높이고, 결합도는 낮출 수 있다.</li>
<li>캡슐 내부의 데이터는 은닉되고, 일부 함수들만이 노출된다.</li>
</ul>
</li>
<li>상속<ul>
<li>어떤 변수 또는 메소드를 하나의 유효범위로 묶어 재정의하는 것이다.</li>
</ul>
</li>
<li>다형성<ul>
<li>하나의 객체가 여러가지 다른 형태를 가질 수 있는 것을 말한다.</li>
<li>자바에서는 오버라이딩, 오버로딩, 그리고 상속받은 객체의 참조변수 형변환 등을 통해 다형성이 드러난다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>추상 클래스를 상속함으로써 자식 클래스는 이를 구현할 수 있다. &quot;abstract&quot; 예약어를 이용하여 추상 클래스를 만들 수 있고, 선언부만 명시하는 추상 메소드를 선언할 수 있다.</li>
<li>인터페이스는 추상 클래스와는 다르게 다중 상속이 가능하다. </li>
</ul>
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
<ul>
<li>가비지 컬렉션(GC)은 힙에서 참조되지 않거나, 사용되지 않는 객체를 찾아 정리해주는 프로세스로 두 가지 종류가 있다. minor GC과 major GC이다. </li>
</ul>
<ol>
<li>minor GC<br>Young Generation이 가득 차면, Young Generation에서는 객체의 높은 mortality rate를 가정하고 최적화되는 minor GC이 발생한다. 모든 minor GC는 Stop the World 이벤트이므로 operation이 끝날 때까지 모든 애플리케이션 쓰레드가 멈춘다.</li>
<li>major GC<br>major GC는 모든 객체를 포함하기 때문에 훨씬 느리다. major GC도 마찬가지로 Stop the World 이벤트이다. </li>
</ol>
<ul>
<li>참고로 힙은 Young Generation, Old Generation, Permanent Generation으로 구분된다.<br>Young Generation은 모든 새 객체가 할당되는 곳이고, Old Generation은 오래 살아남는 객체를 저장하는 것이다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
<ul>
<li>.java 프로그램은 OS에 맞는 실행 파일로 컴파일 되지 않고  확장자를 가진 자바 바이트 코드(.class)로 컴파일된다. </li>
<li>컴파일 된 .class 파일은 JVM의 클래스 로더로 전달된다. 클래스 로더는 1) 동적 로딩을 통해 클래스 파일을 JVM의 메모리에 로드하고 2) 자바 언어 명세와 JVM 명세대로 구성되어 있는지 검사하고 3) 클래스가 요구하는 메모리를 할당하고 4) 클래스의 상수 풀 안의 모든 심볼릭 레퍼런스를 다이렉트 레퍼런스로 변환하고 5) 클래스 변수들을 초기화한다. </li>
<li>실행엔진은 메모리에 올라온 바이트 코드들을 명령어 단위로 하나씩 가져와 실행한다. 실행엔진은 자바 인터프리터와 JIT 컴파일러로 동작할 수 있다.</li>
<li>결론적으로 JVM은 OS가 달라도 동일하게 작동할 수 있는 환경을 제공한다.</li>
</ul></div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>불변객체란 객체 생성 이후 상태를 바꿀 수 없는 객체를 말한다. </li>
<li>필드에 final을 사용하면 불변 객체를 만들 수 있다. </li>
<li>불변 객체를 사용하면 변경이 제한되어 안전하게 사용할 수 있고, 멀티쓰레드 환경에서도 동기화를 고려하지 않고 사용할 수 있다.</li>
</ul></div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
<p>JVM Runtime Area의 메모리 영역은 Method 영역, Heap 영역, Stack 영역으로 구분된다.</p>
<ul>
<li><p>Method 영역</p>
<ul>
<li>클래스 로더에 의해 로드된 클래스, 메소드 정보와 클래스 변수 정보 생성</li>
<li>프로그램 시작부터 종료까지 메모리에 적재된다.</li>
<li>모든 쓰레드가 공유한다.</li>
</ul>
</li>
<li><p>Heap 영역</p>
<ul>
<li>new 키워드로 생성한 객체와 배열 생성</li>
<li>주기적으로 GC가 정리</li>
<li>모든 쓰레드가 공유한다.</li>
</ul>
</li>
<li><p>Stack 영역</p>
<ul>
<li>지역변수 / 파라미터 / 리턴값 / 연산에 사용되는 임시 값 생성</li>
<li>쓰레드마다 생성된다.</li>
</ul></div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>new String()은 여느 객체들처럼 메모리 영역에서 Heap 영역에 주소를 할당받는다. 따라서 동일한 문자열로 생성했더라도 다른 주소에 저장된다.</li>
<li>리터럴은 String Constatnt Pool이라는 공유 메모리 공간에 할당된다.</li>
<li>따라서 같은 문자열을 <code>==</code>를 이용하면 new String()은 false를, 리터럴은 true를 반환한다. 문자열 객체의 내용을 비교하려면 &#39;equals()&#39;를 사용해야 한다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 람다(lambda)에 대해 알아볼까요?</summary>
<div markdown="1">
<p>자바8부터 추가된 기능으로 선언과 동시에 단 하나의 객체, 즉 익명객체를 생성하기 위한 표현식이 람다식이다.</p><pre><code class="language-java">new Object() {
    int min(int x, int y) {
        return x &lt; y ? x : y;
    }
}</code></pre>
<p>위와 같은 익명객체를 만들 필요없이 람다식을 쓰면 된다.</p>
<pre><code class="language-java">(x, y) -&gt; x &lt; y ? x : y;</code></pre>
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 스트림(stream)에 대해 알아볼까요?</summary>
<div markdown="1">
<p>컬렉션이나 배열에 저장되어 있는 요소 하나하나씩 돌아가며 처리하는 일을 간단하게 만들어준다. 가공하거나 정렬한 결과를 컬렉션이나 배열에 담아 반환할 수 있다.</p>
<h3>1. filter</h3>
<p>말그대로 필터링할 때 쓴다.</p>
<pre><code class="language-java">List&lt;String&gt; list = new ArrayList();
list.add(&quot;aaa&quot;);
list.add(&quot;ab&quot;);
list.add(&quot;cc&quot;);

List&lt;String&gt; stringStartingWithA = list.stream().filter(h -&gt; h.startsWith(&quot;a&quot;)).collect(Collectors.toList());</code></pre>
<h3>2. map</h3>
<p>Stream의 요소를 변경시켜줄 때 사용한다.</p>
<pre><code class="language-java">List&lt;String&gt; list = new ArrayList();
list.add(&quot;aaa&quot;);
list.add(&quot;ab&quot;);
list.add(&quot;cc&quot;);

List&lt;String&gt; stringStartingWithUpperCase = list.stream().map(h -&gt; h.toUpperCase()).collect(Collectors.toList());</code></pre>
<h3>3. flatMap()</h3>
<p>복잡한 자료 구조에 저장된 값들을 단순한 자료구조로 바꿀 때 사용한다.</p>
<pre><code class="language-java">String[][] arrays = new String[][]{ {&quot;a1&quot;, &quot;a2&quot;}, {&quot;b1&quot;, &quot;b2&quot;}, {&quot;c1&quot;, &quot;c2&quot;, &quot;c3&quot;} };
Stream&lt;String&gt; stream = Arrays.stream(arrays).flatMap(s-&gt;Arrays.stream(s));</code></pre>
</div>
</details>
<br>

