package pusios.com.soundfy.clips

import android.view.View
import android.widget.Button
import pusios.com.soundfy.R
import pusios.com.soundfy.custom.DraggableButton
import pusios.com.soundfy.list.GenericViewHolder
import pusios.com.soundfy.model.Clip

class ClipViewHolder(view : View): GenericViewHolder<Clip, ClipsAdapterListener>(view) {

    private val button: Button
    private val draggableView: DraggableButton

    init {
        draggableView = view as DraggableButton
        button = view.findViewById(R.id.button_clip) as Button
    }

    override fun bindItem(item: Clip, listener: ClipsAdapterListener) {
        button.text = item.title
        button.setOnClickListener {listener.onClipClicked(item)}
        draggableView.setListener({listener.onShareClip(item)}, {})
    }
}