package com.sangkon.litetodo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sangkon.litetodo.databinding.TodoCardViewBinding

//어댑터가 있어야 카드뷰를 띄울수있다~~



class TodoAdapter: RecyclerView.Adapter<TodoAdapter.TodoHolder>() {
    private val todoList: MutableList<Todo> = mutableListOf()

    override fun getItemCount(): Int = todoList.size

    class TodoHolder(private val binding: TodoCardViewBinding): RecyclerView.ViewHolder(binding.root) {
        fun binData(todo: Todo) {
            binding.todo = todo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        val binding = TodoCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        holder.binData(todoList[position])
    }

    fun setTodoList(list: List<Todo>) {
        todoList.addAll(list)
    }
}
/*Todo를 Holder에 있는 친구가 CardView로 변경해주는 Adapter이다.*/
// TodoHolder를 밖으로 둘 수도 있지만 어댑터 클래스 안에 두는 게 더 편함
