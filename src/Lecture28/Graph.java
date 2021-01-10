package Lecture28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, Vertex> vtces = new HashMap<>();

	public int noOfVertex() {
		return vtces.size();
	}

	public boolean containsVertex(String vname) {
		return vtces.containsKey(vname);
	}

	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		vtces.put(vname, vtx);
	}

	public void removeVertex(String vname) {
		Vertex vtx = vtces.get(vname);
		for (String nbr : vtx.nbrs.keySet()) {
			Vertex nbrvtx = vtces.get(nbr);
			nbrvtx.nbrs.remove(vname);
		}
		vtces.remove(vname);
	}

	public int noOfEdges() {
		int sum = 0;
		for (String key : vtces.keySet()) {
			Vertex vtx = vtces.get(key);
			sum += vtx.nbrs.size();
		}
		return sum / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}

	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}

	public void removeEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}

	public void display() {
		System.out.println("--------------------");
		for (String key : vtces.keySet()) {
			Vertex vtx = vtces.get(key);
			String str = key + " -> " + vtx.nbrs;
			System.out.println(str);
		}
		System.out.println("--------------------");
	}

	public boolean haspath(String src, String dst, HashMap<String, Boolean> processed) {

		processed.put(src, true);

		if (containsEdge(src, dst)) {
			return true;
		}

		Vertex vtx = vtces.get(src);
		for (String nbr : vtx.nbrs.keySet()) {

			if (!processed.containsKey(nbr) && haspath(nbr, dst, processed)) {
				return true;
			}
		}
		return false;
	}

	public class Pair {
		String vname;
		String psf;
		String color;
	}

	public boolean bfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		queue.addLast(sp);

		while (!queue.isEmpty()) {

			Pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);

			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			Vertex vtx = vtces.get(rp.vname);

			for (String nbr : vtx.nbrs.keySet()) {

				if (!processed.containsKey(nbr)) {

					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					queue.addLast(np);
				}
			}

		}

		return false;
	}

	public boolean dfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> Stack = new LinkedList<>();

		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		Stack.addFirst(sp);

		while (!Stack.isEmpty()) {

			Pair rp = Stack.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			Vertex vtx = vtces.get(rp.vname);

			for (String nbr : vtx.nbrs.keySet()) {

				if (!processed.containsKey(nbr)) {

					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					Stack.addFirst(np);
				}
			}

		}

		return false;
	}

	public void bft() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);

			while (!queue.isEmpty()) {

				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.psf);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {

						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}

		}
	}

	public void dft() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> Stack = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			Stack.addFirst(sp);

			while (!Stack.isEmpty()) {

				Pair rp = Stack.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.psf);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {

						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						Stack.addFirst(np);
					}
				}

			}
		}
	}

	public boolean isCyclic() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> Stack = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			Stack.addFirst(sp);

			while (!Stack.isEmpty()) {

				Pair rp = Stack.removeFirst();

				if (processed.containsKey(rp.vname)) {
					return true;
				}
				processed.put(rp.vname, true);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {

						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						Stack.addFirst(np);
					}
				}

			}
		}
		return false;
	}

	public boolean isConnected() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> Stack = new LinkedList<>();

		int var = 0;

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}
			var++;
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			Stack.addFirst(sp);

			while (!Stack.isEmpty()) {

				Pair rp = Stack.removeFirst();

				if (processed.containsKey(rp.vname)) {
					return true;
				}
				processed.put(rp.vname, true);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {

						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						Stack.addFirst(np);
					}
				}

			}
		}
		return var == 1;
	}

	public boolean isTree() {
		return isConnected() && !isCyclic();
	}

	public ArrayList<ArrayList<String>> getcc() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> Stack = new LinkedList<>();

		ArrayList<ArrayList<String>> ans = new ArrayList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}
			ArrayList<String> subans = new ArrayList();
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			Stack.addFirst(sp);

			while (!Stack.isEmpty()) {

				Pair rp = Stack.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);

				subans.add(rp.vname);
				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {

						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						Stack.addFirst(np);
					}
				}

			}
			ans.add(subans);
		}
		return ans;
	}

	public boolean isBipartite() {

		HashMap<String, String> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			sp.color = "r";
			queue.addLast(sp);

			while (!queue.isEmpty()) {

				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.vname)) {

					String oc = processed.get(rp.vname);
					String nc = rp.color;

					if (!oc.equals(nc)) {
						return false;
					}

				}
				processed.put(rp.vname, rp.color);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {

						String color = rp.color == "r" ? "g" : "r";
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						np.color = color;

						queue.addLast(np);
					}
				}

			}

		}
		return true;
	}
}
