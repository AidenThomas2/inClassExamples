# Comparing Arrays and Linked Lists

Comparing an **Array** and a **Linked List** is one of the classic topics in computer science. While both are used to store collections of data, they handle memory and operations quite differently, making each suited for different use cases.

---

## Quick Comparison Table

| Operation / Feature | Array | Linked List |
| :--- | :--- | :--- |
| **Memory Allocation** | Contiguous (side-by-side in memory) | Non-contiguous (scattered, linked via pointers) |
| **Access Time (by Index)** | $O(1)$ — Fast, direct access | $O(n)$ — Slow, must traverse from the head |
| **Insertion at the End** | $O(1)$ amortized (if space permits) | $O(n)$ (or $O(1)$ if a tail pointer is maintained) |
| **Insertion at the Beginning** | $O(n)$ — Requires shifting elements | $O(1)$ — Just update head pointer |
| **Deletion** | $O(n)$ — Requires shifting elements | $O(1)$ (if node is known) or $O(n)$ to find it |
| **Memory Overhead** | Low (only stores data) | Higher (stores data + memory address pointer per node) |

---

## Key Differences in Detail

### 1. Memory Allocation and Layout
* **Array:** Elements are stored in contiguous (consecutive) memory locations. Because the memory is packed together, the computer can easily calculate the memory address of any element using its index.
* **Linked List:** Elements (called **nodes**) are scattered across memory. Each node contains the actual data and a **pointer** (or reference) pointing to the address of the next node in the sequence.

### 2. Accessing Elements (Searching)
* **Array:** Offers **random access**. If you want the 500th element, the system jumps straight to it instantly ($O(1)$ time complexity).
* **Linked List:** Offers only **sequential access**. To find the 500th element, you must start at the first node (the head) and follow the pointers one by one until you reach number 500 ($O(n)$ time complexity).

### 3. Insertion and Deletion
* **Array:** 
  * Inserting or deleting an element in the middle or at the beginning requires **shifting** all subsequent elements to maintain contiguous order, which can be slow ($O(n)$).
  * Resizing a static array requires creating a new, larger array and copying all elements over.
* **Linked List:** 
  * Inserting or deleting an item is very fast if you are already at that position—you simply change a few pointer references ($O(1)$). No shifting is required. 
  * However, finding the position to insert or delete still requires traversing the list ($O(n)$).

### 4. Memory Efficiency
* **Array:** More memory efficient per element because it only stores the data itself. However, static arrays can waste memory if allocated space goes unused, and dynamic arrays occasionally waste memory during resizing operations.
* **Linked List:** Consumes extra memory overhead because every single node must store both the data and one or more pointers (references to the next/previous nodes).

---

## Summary: When to Use Which?

* **Use an Array when:**
  * You need frequent, fast access to elements by their index.
  * The size of your dataset is relatively fixed or predictable.
  * You want to minimize memory overhead.
  * *Examples:* Lookup tables, matrices, lists where you mostly read or update existing elements by index.

* **Use a Linked List when:**
  * You need constant, heavy insertions and deletions, especially at the beginning or middle of the collection.
  * The total size of the data is unpredictable and grows/shrinks frequently.
  * You do not need fast random access by index.
  * *Examples:* Implementing queues, stacks, or symbol tables where data is constantly being added and removed.