
# 🧠 Java Collections – Use Case + Complexity Cheat Sheet

---

## ✅ Collection Summary Table

| Collection Type         | Best Use Case                                                  | Thread Safe      | Random Access | Null Allowed | Search (Worst) | Sort (Worst) |
|-------------------------|----------------------------------------------------------------|------------------|---------------|--------------|----------------|---------------|
| `ArrayList`             | Fast access, iteration-heavy                                   | ❌ No            | ✅ Yes        | ✅ Yes       | O(n)           | O(n log n)    |
| `LinkedList`            | Frequent add/remove at start/mid                               | ❌ No            | ❌ No         | ✅ Yes       | O(n)           | O(n log n)    |
| `Vector`                | Thread-safe ArrayList (legacy)                                 | ✅ Yes (legacy)  | ✅ Yes        | ✅ Yes       | O(n)           | O(n log n)    |
| `Stack`                 | LIFO structure (use Deque instead)                             | ✅ Yes (legacy)  | ✅ Yes        | ✅ Yes       | O(n)           | O(n log n)    |
| `CopyOnWriteArrayList`  | Many reads, few writes – thread-safe                           | ✅ Yes (modern)  | ✅ Yes        | ✅ Yes       | O(n)           | O(n log n)    |
| `HashSet`               | Fast lookups, no duplicates                                    | ❌ No            | ❌ No         | ✅ Yes (1)   | O(1)           | Not applicable |
| `LinkedHashSet`         | Predictable iteration order, fast lookup                      | ❌ No            | ❌ No         | ✅ Yes (1)   | O(1)           | Not applicable |
| `TreeSet`               | Sorted, unique elements                                        | ❌ No            | ❌ No         | ❌ No        | O(log n)       | O(n log n)    |
| `HashMap`               | Key-value pairs, fast lookup                                   | ❌ No            | ❌ No         | One null key | O(1) (avg), O(n) worst | Not applicable |
| `LinkedHashMap`         | Ordered `HashMap`, predictable iteration                      | ❌ No            | ❌ No         | ✅ Yes       | O(1)           | Not applicable |
| `TreeMap`               | Sorted keys, ordered map                                       | ❌ No            | ❌ No         | ❌ No        | O(log n)       | O(n log n)    |
| `Hashtable`             | Thread-safe map (legacy)                                       | ✅ Yes (legacy)  | ❌ No         | ❌ No        | O(1)           | Not applicable |
| `ConcurrentHashMap`     | Thread-safe, scalable map                                      | ✅ Yes (modern)  | ❌ No         | One null value only | O(1) (avg) | Not applicable |
| `PriorityQueue`         | Efficient priority-based retrieval                             | ❌ No            | ❌ No         | ❌ No        | O(n)           | O(n log n)    |
| `ArrayDeque`            | Fast stack/queue operations (better than Stack/LinkedList)     | ❌ No            | ❌ No         | ❌ No        | O(n)           | O(n log n)    |
| `LinkedBlockingQueue`   | Producer-consumer (thread-safe blocking queue)                 | ✅ Yes           | ❌ No         | ✅ Yes       | O(n)           | O(n log n)    |

> ✅ `null allowed (1)`: `HashSet`, `LinkedHashSet`, and `HashMap` allow one `null` key and multiple `null` values.

---

## 📘 Category-wise Details

### 🔹 List Implementations

| Class | Random Access | Use Case |
|-------|---------------|----------|
| `ArrayList` | ✅ | Default for general use, good for search & iteration |
| `LinkedList` | ❌ | Insert/delete from start or middle |
| `CopyOnWriteArrayList` | ✅ | Thread-safe read-heavy scenario |
| `Vector` | ✅ | Legacy thread-safe |
| `Stack` | ✅ | LIFO, replaced by `Deque` |

---

### 🔸 Set Implementations

| Class | Maintains Order | Use Case |
|-------|------------------|----------|
| `HashSet` | ❌ | No duplicates, fast lookup |
| `LinkedHashSet` | ✅ | Maintains insertion order |
| `TreeSet` | ✅ (Sorted) | Sorted elements, no duplicates |

---

### 🔸 Map Implementations

| Class | Maintains Order | Use Case |
|-------|------------------|----------|
| `HashMap` | ❌ | Fast access with keys |
| `LinkedHashMap` | ✅ | Maintains insertion order |
| `TreeMap` | ✅ (Sorted by keys) | Sorted keys |
| `ConcurrentHashMap` | ❌ | Thread-safe modern map |
| `Hashtable` | ❌ | Legacy thread-safe |

---

### 🔹 Queue & Deque Implementations

| Class | Blocking? | Use Case |
|-------|-----------|----------|
| `PriorityQueue` | ❌ | Priority-based task processing |
| `ArrayDeque` | ❌ | Stack or queue (non-thread-safe) |
| `LinkedBlockingQueue` | ✅ | Producer-consumer problem |

---

## 🧠 Quick Decision Tips

- 🔹 Use `ArrayList` for default lists.
- 🔹 Use `HashSet` if you need unique elements with no sorting.
- 🔹 Use `TreeSet` if you need sorted, unique elements.
- 🔹 Use `HashMap` for general key-value stores.
- 🔹 Use `ConcurrentHashMap` in multithreaded key-value use cases.
- 🔹 Use `ArrayDeque` instead of `Stack` or `Queue` for better performance.
