package com.ganesh_shetty.firstcompose;

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun PreviewItem() {
    LazyColumn {
        items(getCategoryList()) { category ->
            BlogCategory(image = category.img, title = category.title, subTitle = category.subTitle)
        }
    }
}

@Composable
fun BlogCategory(
    image: Int,
    title: String,
    subTitle: String
) {
    Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(8.dp)) {
        Row(
            Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .weight(.2f),
            )
            ItemDescription(title, subTitle, Modifier.Companion.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subTitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = subTitle,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Category(
    val img: Int,
    val title: String,
    val subTitle: String
)

fun getCategoryList(): List<Category> {
    return listOf(
        Category(R.drawable.img, "Ganesh Shetty", "Senior Android Developer"),
        Category(R.drawable.img_1, "Ravindra", "Infra Manager"),
        Category(R.drawable.img_2, "Abhinay", "Finance Officer"),
        Category(R.drawable.img_3, "Sudarshan", "Food Manager"),
        Category(R.drawable.img_4, "Ranjith", "Food Delivery Manager"),
        Category(R.drawable.img_5, "Akshay", "Junior Android Developer"),
        Category(R.drawable.img, "Ganesh Shetty", "Senior Android Developer"),
        Category(R.drawable.img_1, "Ravindra", "Infra Manager"),
        Category(R.drawable.img_2, "Abhinay", "Finance Officer"),
        Category(R.drawable.img_3, "Sudarshan", "Food Manager"),
        Category(R.drawable.img_4, "Ranjith", "Food Delivery Manager"),
        Category(R.drawable.img_5, "Akshay", "Junior Android Developer"),
        Category(R.drawable.img, "Ganesh Shetty", "Senior Android Developer"),
        Category(R.drawable.img_1, "Ravindra", "Infra Manager"),
        Category(R.drawable.img_2, "Abhinay", "Finance Officer"),
        Category(R.drawable.img_3, "Sudarshan", "Food Manager"),
        Category(R.drawable.img_4, "Ranjith", "Food Delivery Manager"),
        Category(R.drawable.img_5, "Akshay", "Junior Android Developer"),
        Category(R.drawable.img, "Ganesh Shetty", "Senior Android Developer"),
        Category(R.drawable.img_1, "Ravindra", "Infra Manager"),
        Category(R.drawable.img_2, "Abhinay", "Finance Officer"),
        Category(R.drawable.img_3, "Sudarshan", "Food Manager"),
        Category(R.drawable.img_4, "Ranjith", "Food Delivery Manager"),
        Category(R.drawable.img_5, "Akshay", "Junior Android Developer")
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
private fun PreviewFunction() {
    Text(
        text = "Hello",
        color= Color.White,
        modifier = Modifier
            .clickable { }
            .size(200.dp)
            .background(Color.Yellow)
            .padding(36.dp)
            .clip(CircleShape)
            .background(Color.Blue)
    )
}

//    Column {
//        ListViewItem(
//            R.drawable.baseline_account_circle_24,
//            "Ganesh Shetty",
//            "Android Developer"
//        )
//        ListViewItem(
//            R.drawable.baseline_account_circle_24,
//            "Abhinay Shetty",
//            "Finance"
//        )
//        ListViewItem(
//            R.drawable.baseline_account_circle_24,
//            "Akshay Shetty",
//            "Junior Android Developer"
//        )
//    }


@Composable
fun ListViewItem(
    imageId: Int,
    name:String,
    occupation: String
) {
    Row(
        Modifier.padding(8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = "",
            Modifier.size(40.dp)
        )
        Column {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
    }
}


//Text(
//  text = "Ganesh Shetty",
//  fontStyle = FontStyle.Italic,
//  fontWeight = FontWeight.ExtraBold,
//  color = Color.Red,
//  fontSize = 36.sp,
//  textAlign = TextAlign.Right
//)

//    Image(
//        painter = painterResource(id = androidx.core.R.drawable.ic_call_answer),
//        contentDescription = "Dummy Image",
//        colorFilter = ColorFilter.tint(Color.Blue),
//        contentScale = ContentScale.Inside
//    )

//    Button(
//        onClick = {  },
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Black,
//            contentColor = Color.White
//        ),
//        enabled = false
//    ) {
//        Text(text = "Hello")
//        Image(painter = painterResource(id = androidx.core.R.drawable.ic_call_answer), contentDescription = "Dummy image")
//    }


//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun SayCheezy() {
//    val state = remember{mutableStateOf("")}
//    TextField(
//        value = state.value,
//        onValueChange = {
//            state.value = it
//            Log.d("MY CHEEZY", it)
//        },
//        label = {
//            Text(text = "Enter message")
//        }
//    )
//}

//Column(
//verticalArrangement = Arrangement.SpaceEvenly,
//horizontalAlignment = Alignment.CenterHorizontally
//) {
//    Text(text = "A", fontSize = 24.sp)
//    Text(text = "B", fontSize = 24.sp)
//}

//    Row(
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }

//    Box(contentAlignment = Alignment.Center) {
//        Image(painter = painterResource(id = androidx.core.R.drawable.ic_call_answer_low), contentDescription = "")
//        Image(painter = painterResource(id = androidx.core.R.drawable.ic_call_answer_video), contentDescription = "")
//    }


