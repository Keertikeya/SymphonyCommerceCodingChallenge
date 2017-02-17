
public class InputClass {

	public static void main(String[] args) {
		
		ShortURL s = new ShortURL();
		
		System.out.println(s.set("www.zero.com"));
		System.out.println(s.set("www.one.com"));
		System.out.println(s.set("www.two.com"));
		System.out.println(s.set("www.three.com"));
		System.out.println(s.set("www.four.com"));
		System.out.println(s.set("www.five.com"));
		System.out.println(s.set("www.six.com"));
		System.out.println(s.set("www.seven.com"));
		System.out.println(s.set("www.eight.com"));
		System.out.println(s.set("www.nine.com"));
		System.out.println(s.set("www.capital-a.com"));
		System.out.println(s.set("www.capital-b.com"));
		System.out.println(s.set("www.capital-c.com"));
		System.out.println(s.set("www.capital-d.com"));
		System.out.println(s.set("www.capital-e.com"));
		System.out.println(s.set("www.capital-f.com"));
		System.out.println(s.set("www.capital-g.com"));
		System.out.println(s.set("www.capital-h.com"));
		System.out.println(s.set("www.capital-i.com"));
		System.out.println(s.set("www.capital-j.com"));
		System.out.println(s.set("www.capital-k.com"));
		System.out.println(s.set("www.capital-l.com"));
		System.out.println(s.set("www.capital-m.com"));
		System.out.println(s.set("www.capital-n.com"));
		System.out.println(s.set("www.capital-o.com"));
		System.out.println(s.set("www.capital-p.com"));
		System.out.println(s.set("www.capital-q.com"));
		System.out.println(s.set("www.capital-r.com"));
		System.out.println(s.set("www.capital-s.com"));
		System.out.println(s.set("www.capital-t.com"));
		System.out.println(s.set("www.capital-u.com"));
		System.out.println(s.set("www.capital-v.com"));
		System.out.println(s.set("www.capital-w.com"));
		System.out.println(s.set("www.capital-x.com"));
		System.out.println(s.set("www.capital-y.com"));
		System.out.println(s.set("www.capital-z.com"));
		System.out.println(s.set("www.small-a.com"));
		System.out.println(s.set("www.small-b.com"));
		System.out.println(s.set("www.small-c.com"));
		System.out.println(s.set("www.small-d.com"));
		System.out.println(s.set("www.small-e.com"));
		System.out.println(s.set("www.small-f.com"));
		System.out.println(s.set("www.small-g.com"));
		System.out.println(s.set("www.small-h.com"));
		System.out.println(s.set("www.small-i.com"));
		System.out.println(s.set("www.small-j.com"));
		System.out.println(s.set("www.small-k.com"));
		System.out.println(s.set("www.small-l.com"));
		System.out.println(s.set("www.small-m.com"));
		System.out.println(s.set("www.small-n.com"));
		System.out.println(s.set("www.small-o.com"));
		System.out.println(s.set("www.small-p.com"));
		System.out.println(s.set("www.small-q.com"));
		System.out.println(s.set("www.small-r.com"));
		System.out.println(s.set("www.small-s.com"));
		System.out.println(s.set("www.small-t.com"));
		System.out.println(s.set("www.small-u.com"));
		System.out.println(s.set("www.small-v.com"));
		System.out.println(s.set("www.small-w.com"));
		System.out.println(s.set("www.small-x.com"));
		System.out.println(s.set("www.small-y.com"));
		System.out.println(s.set("www.small-z.com"));
		System.out.println(s.set("www.invlalid-input.com"));
		
		System.out.println();
		
		System.out.println("0: " + s.get("0"));
		System.out.println("9: " + s.get("9"));
		System.out.println("A: " + s.get("A"));
		System.out.println("Z: " + s.get("Z"));
		System.out.println("a: " + s.get("a"));
		System.out.println("z: " + s.get("z"));
		System.out.println("09: " + s.get("09"));
		System.out.println("AZ: " + s.get("AZ"));
		System.out.println("az: " + s.get("az"));
		System.out.println("!: " + s.get("!"));
		System.out.println("!#: " + s.get("!#"));
		System.out.println("Empty key: " + s.get(""));
	}

}
