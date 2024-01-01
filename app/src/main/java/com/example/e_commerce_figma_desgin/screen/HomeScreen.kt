import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce_figma_desgin.Compount.MyReusableCardWithIcon
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextSubHeading
import com.example.e_commerce_figma_desgin.R
import androidx.compose.material3.*
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextHeading
import com.example.e_commerce_figma_desgin.Compount.TempSportView
import com.example.e_commerce_figma_desgin.Navigation.listofNavItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    Scaffold(
        bottomBar = {
            NavigationBar {
                // this line manage navigation backStack
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                listofNavItems.forEach {
                    navItems ->
                    NavigationBarItem(currentDestination?.hierarchy?.any {it.route==navItems.route  }==true,
                        { navController.navigate(navItems.route) {
                            popUpTo(navController.graph.findStartDestination().id){
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        } },
                        { Icon(
                            imageVector = navItems.icon,
                            contentDescription = ""
                        )}
                    , label = { Text(text = navItems.title)})
                }

            }
        }

    ) { paddingValues ->

        // main Container
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            // top heading container
            Card(
                modifier = Modifier
                    .background(color = Color.White)
                    .padding(2.dp),
                colors = CardDefaults.cardColors(Color(132, 199, 238, 112))
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                ///  .padding(paddingValues = paddingValues),
                 ,   verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier = Modifier.padding(10.dp),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.Start
                    )
                    {
                        MyReusableTextSubHeading(value = "Id:2222")
                       // Spacer(modifier = Modifier.heightIn(10.dp))
                        MyReusableTextSubHeading(value = "hello Sadiq")

                    }
                    Spacer(modifier = Modifier.widthIn(160.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
                    )
                    {
                        Icon(
                            Icons.Default.Notifications,
                            contentDescription = ""
                            //    9900674604
                        )
                        Spacer(modifier = Modifier.widthIn(20.dp))

                        Image(
                            painter = painterResource(id = R.drawable.download),
                            contentDescription = "",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)                       // clip to the circle shape
                                .border(2.dp, Color.Gray, CircleShape),
                            contentScale = ContentScale.FillBounds,
                        )
                    }
                }  //  end heading container
            }  //  end heading card  container

            // search view container
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)) {
                OutlinedTextField(value = "SearchView", onValueChange = {}, modifier = Modifier.fillMaxWidth()) }
            // end search view container

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(top = 10.dp, start = 20.dp, end = 20.dp, bottom = 20.dp),
                    verticalArrangement = Arrangement.Center)
                {
                    Image(
                        painter = painterResource(id = R.drawable.downloa),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .heightIn(120.dp)
                            .size(12.dp)
                            .clip(RoundedCornerShape(10.dp))                       // clip to the circle shape
                            .border(2.dp, Color.Gray, RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillBounds,
                    )
                }
               // end  brand Add container

            Row(modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically)
            {
                MyReusableCardWithIcon(
                    backgroudColor = Color(93, 93, 236, 237),
                    imageVector = Icons.Default.Notifications,
                    IconName = "Attendace"
                )

                MyReusableCardWithIcon(
                    backgroudColor = Color(142, 110, 236, 255),
                    imageVector = Icons.Default.List,
                    IconName = "Exam"
                )

                MyReusableCardWithIcon(
                    backgroudColor = Color(142, 110, 236, 255),
                    imageVector = Icons.Default.Checklist,
                    IconName = "Leave"
                )

                MyReusableCardWithIcon(
                    backgroudColor = Color(142, 110, 236, 255),
                    imageVector = Icons.Default.AccountBalance,
                    IconName = "Fees"
                )


            }

            //
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
                , horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                MyReusableCardWithIcon(
                    backgroudColor = Color(93, 93, 236, 237),
                    imageVector = Icons.Default.Notifications,
                    IconName = "Attendace"
                )

                MyReusableCardWithIcon(
                    backgroudColor = Color(142, 110, 236, 255),
                    imageVector = Icons.Default.List,
                    IconName = "Exam"
                )

                MyReusableCardWithIcon(
                    backgroudColor = Color(142, 110, 236, 255),
                    imageVector = Icons.Default.Checklist,
                    IconName = "Leave"
                )

                MyReusableCardWithIcon(
                    backgroudColor = Color(142, 110, 236, 255),
                    imageVector = Icons.Default.AccountBalance,
                    IconName = "Fees"
                )


            }

            //  this row is events
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                //  .padding(paddingValues),
                , horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                MyReusableTextHeading(value = "Upcoming Events")
                MyReusableTextSubHeading(value = "View All")
            }



            //
            Row(modifier = Modifier.padding(top = 5.dp, bottom = 5.dp,
                start = 10.dp, end = 10.dp) )
            {
                TempSportView(value = "SPORTS DAY ", date = "11,21,2024")
                TempSportView(value = "ANNUAL DAY ", date = "10,04,2024")
              //  TempSportView()
            }


            }   // main coloum end





        }

    }



@Composable
@Preview(showBackground = true)
fun HomeP() {
    val navController= rememberNavController()
    HomeScreen(navController = navController)
}