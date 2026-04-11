package com.example.miniimdb.data;

import com.example.miniimdb.R;
import com.example.miniimdb.model.Movie;
import com.example.miniimdb.model.Actor;

import java.util.ArrayList;
public class MovieData {
    private static ArrayList<Movie> movies;
    public static ArrayList<Movie> getMovies() {
        if (movies != null) {
            return movies;
        }
        movies = new ArrayList<>();

        ArrayList<Actor> actors1 = new ArrayList<>();
        actors1.add(new Actor("Leonardo DiCaprio", R.drawable.leonardo_dicaprio));
        actors1.add(new Actor("Joseph Gordon-Levitt", R.drawable.joseph_gordon_levitt));
        actors1.add(new Actor("Elliot Page", R.drawable.elliot_page));
        actors1.add(new Actor("Tom Hardy", R.drawable.tom_hardy));
        actors1.add(new Actor("Ken Watanabe", R.drawable.ken_watanabe));
        movies.add(new Movie(
                "Inception",
                "Sci-Fi",
                8.8f,
                "A thief who steals through dream-sharing technology gets a chance to erase his past. He must perform the impossible task of planting an idea into someone's mind.",
                R.drawable.inception,
                actors1
        ));

        ArrayList<Actor> actors2 = new ArrayList<>();
        actors2.add(new Actor("Matthew McConaughey", R.drawable.matthew_mcconaughey));
        actors2.add(new Actor("Anne Hathaway", R.drawable.anne_hathaway));
        actors2.add(new Actor("Jessica Chastain", R.drawable.jessica_chastain));
        actors2.add(new Actor("Michael Caine", R.drawable.michael_caine));
        actors2.add(new Actor("Mackenzie Foy", R.drawable.mackenzie_foy));
        movies.add(new Movie(
                "Interstellar",
                "Sci-Fi",
                8.7f,
                "A group of explorers travel through a wormhole in space to save humanity. Time, love and survival become deeply connected in their mission.",
                R.drawable.interstellar,
                actors2
        ));

        ArrayList<Actor> actors3 = new ArrayList<>();
        actors3.add(new Actor("Christian Bale", R.drawable.christian_bale));
        actors3.add(new Actor("Heath Ledger", R.drawable.heath_ledger));
        actors3.add(new Actor("Aaron Eckhart", R.drawable.aaron_eckhart));
        actors3.add(new Actor("Michael Caine", R.drawable.michael_caine));
        actors3.add(new Actor("Gary Oldman", R.drawable.gary_oldman));
        movies.add(new Movie(
                "The Dark Knight",
                "Action",
                9.0f,
                "Batman faces the Joker, a criminal mastermind who throws Gotham into chaos. The story explores sacrifice, justice and moral choices.",
                R.drawable.the_dark_knight,
                actors3
        ));

        ArrayList<Actor> actors4 = new ArrayList<>();
        actors4.add(new Actor("Keanu Reeves", R.drawable.keanu_reeves));
        actors4.add(new Actor("Laurence Fishburne", R.drawable.laurence_fishburne));
        actors4.add(new Actor("Carrie-Anne Moss", R.drawable.carrie_ann_moss));
        actors4.add(new Actor("Hugo Weaving", R.drawable.hugo_weaving));
        actors4.add(new Actor("Joe Pantoliano",R.drawable.joe_pantoliano));
        movies.add(new Movie(
                "The Matrix",
                "Sci-Fi",
                8.7f,
                "A computer hacker learns that reality is a simulation controlled by machines. He joins a rebellion to fight for human freedom.",
                R.drawable.the_matrix,
                actors4
        ));

        ArrayList<Actor> actors5 = new ArrayList<>();
        actors5.add(new Actor("Elijah Wood", R.drawable.elijah_wood));
        actors5.add(new Actor("Ian McKellen", R.drawable.ian_mckellen));
        actors5.add(new Actor("Viggo Mortensen", R.drawable.viggo_mortensen));
        actors5.add(new Actor("Sean Astin", R.drawable.sean_astin));
        actors5.add(new Actor("Orlando Bloom", R.drawable.orlando_bloom));
        movies.add(new Movie(
                "The Lord of the Rings",
                "Fantasy",
                8.9f,
                "A young hobbit begins a dangerous journey to destroy a powerful ring. Friendship and courage guide the fellowship through Middle-earth.",
                R.drawable.the_lord_of_the_rings,
                actors5
        ));

        ArrayList<Actor> actors6 = new ArrayList<>();
        actors6.add(new Actor("Sam Worthington", R.drawable.sam_worthington));
        actors6.add(new Actor("Zoe Saldana", R.drawable.zoe_saldana));
        actors6.add(new Actor("Sigourney Weaver", R.drawable.sigourney_weaver));
        actors6.add(new Actor("Stephen Lang", R.drawable.stephen_lang));
        actors6.add(new Actor("Michelle Rodriguez", R.drawable.michelle_rodriguez));
        movies.add(new Movie(
                "Avatar",
                "Adventure",
                7.8f,
                "A marine on an alien planet become torn between orders and a new way of life. The film focuses on nature, conflict and identity.",
                R.drawable.avatar,
                actors6
        ));

        ArrayList<Actor> actors7 = new ArrayList<>();
        actors7.add(new Actor("Tom Hanks", R.drawable.tom_hanks));
        actors7.add(new Actor("Robin Wright", R.drawable.robin_wright));
        actors7.add(new Actor("Gary Sinise", R.drawable.gary_sinise));
        actors7.add(new Actor("Sally Field", R.drawable.sally_field));
        actors7.add(new Actor("Mykelti Williamson", R.drawable.mykelti_williamson));
        movies.add(new Movie(
                "Forrest Gump",
                "Drama",
                8.8f,
                "A kind-hearted man unintentionally witnesses many important moments in American history. His life story is both emotional and inspiring.",
                R.drawable.forrest_gump,
                actors7
        ));

        ArrayList<Actor> actors8 = new ArrayList<>();
        actors8.add(new Actor("Brad Pitt", R.drawable.brad_pitt));
        actors8.add(new Actor("Edward Norton", R.drawable.edward_norton));
        actors8.add(new Actor("Helena Bonham Carter", R.drawable.helena_bonham_carter));
        actors8.add(new Actor("Meat Loaf", R.drawable.meat_loaf));
        actors8.add(new Actor("Jared Leto", R.drawable.jared_leto));
        movies.add(new Movie(
                "Fight Club",
                "Drama",
                8.8f,
                "A frustrated office worker forms an underground fight club with a mysterious soap salesman. Their rebellion grows into something dangerous.",
                R.drawable.fight_club,
                actors8
        ));

        ArrayList<Actor> actors9 = new ArrayList<>();
        actors9.add(new Actor("Leonardo diCaprio", R.drawable.leonardo_dicaprio));
        actors9.add(new Actor("Kate Winslet", R.drawable.kate_winslet));
        actors9.add(new Actor("Billy Zane", R.drawable.billy_zane));
        actors9.add(new Actor("Kathy Bates", R.drawable.kathy_bates));
        actors9.add(new Actor("Frances Fisher", R.drawable.frances_fisher));
        movies.add(new Movie(
                "Titanic",
                "Romance",
                7.9f,
                "Two young people from different social classes fall in love aboard the Titanic. Their romance unfolds during one of history's greatest disasters.",
                R.drawable.titanic,
                actors9
        ));

        ArrayList<Actor> actors10 = new ArrayList<>();
        actors10.add(new Actor("Joaquin Phoenix", R.drawable.joaquin_phoenix));
        actors10.add(new Actor("Robert De Niro", R.drawable.robert_de_niro));
        actors10.add(new Actor("Zazie Beetz", R.drawable.zazie_beetz));
        actors10.add(new Actor("Frances Conroy", R.drawable.frances_conroy));
        actors10.add(new Actor("Brett Cullen", R.drawable.brett_cullen));
        movies.add(new Movie(
                "Joker",
                "Crime",
                8.4f,
                "A lonely man ignored by society slowly transforms into a violent symbol of chaos. The film shows the tragic collapse of his mental state.",
                R.drawable.joker,
                actors10
        ));

        ArrayList<Actor> actors11 = new ArrayList<>();
        actors11.add(new Actor("Robert Downey Jr.", R.drawable.robert_downey_jr));
        actors11.add(new Actor("Chris Evans", R.drawable.chris_evans));
        actors11.add(new Actor("Scarlett Johansson", R.drawable.scarlett_johansson));
        actors11.add(new Actor("Mark Ruffalo", R.drawable.mark_ruffalo));
        actors11.add(new Actor("Chris Hemsworth", R.drawable.chris_hemsworth));
        movies.add(new Movie(
                "Avengers: End game",
                "Superhero",
                8.4f,
                "The Avengers assemble for one final mission to undo a devastating loss. The movie combines sacrifice, action and emotional closure.",
                R.drawable.avengers_end_game,
                actors11
        ));

        ArrayList<Actor> actors12 = new ArrayList<>();
        actors12.add(new Actor("Chris Pratt", R.drawable.chris_pratt));
        actors12.add(new Actor("Bryce Dallas Howard", R.drawable.bryce_dallas_howard));
        actors12.add(new Actor("Nick Robinson", R.drawable.nick_robinson));
        actors12.add(new Actor("Ty Simpkins", R.drawable.ty_simpkins));
        actors12.add(new Actor("Vincent D'Onofrio", R.drawable.vincent_donofrio));
        movies.add(new Movie(
                "Jurassic World",
                "Adventure",
                7.0f,
                "A dinosaur theme park falls into caos when a genetically engineered creature escapes. Visitors must fight to survive on the island.",
                R.drawable.jurassic_world,
                actors12
        ));

        ArrayList<Actor> actors13 = new ArrayList<>();
        actors13.add(new Actor("Ryan Gosling", R.drawable.ryan_gosling));
        actors13.add(new Actor("Emma Stone", R.drawable.emma_stone));
        actors13.add(new Actor("John Legend", R.drawable.john_legend));
        actors13.add(new Actor("Rosemarie DeWitt", R.drawable.rosemary_dewit));
        actors13.add(new Actor("Finn Wittrock", R.drawable.finn_wittrock));
        movies.add(new Movie(
                "La La Land",
                "Musical",
                8.0f,
                "A musician and an aspiring actress fall in love while chasing their dreams in Los Angeles. Their romance is tested by ambition and reality.",
                R.drawable.la_la_land,
                actors13
        ));

        ArrayList<Actor> actors14 = new ArrayList<>();
        actors14.add(new Actor("Margot Robbie", R.drawable.margot_robbie));
        actors14.add(new Actor("Ryan Gosling", R.drawable.ryan_gosling));
        actors14.add(new Actor("America Ferrera", R.drawable.america_ferrera));
        actors14.add(new Actor("Kate McKinnon", R.drawable.kate_mckinnon));
        actors14.add(new Actor("Issa Rae", R.drawable.issa_rae));
        movies.add(new Movie(
                "Barbie",
                "Comedy",
                7.2f,
                "Barbie leaves her perfect world and discovers the complications of real life. The movie mixes humor with identity and social commentary",
                R.drawable.barbie,
                actors14
        ));

        ArrayList<Actor> actors15 = new ArrayList<>();
        actors15.add(new Actor("Cillian Murphy", R.drawable.cillian_murphy));
        actors15.add(new Actor("Emily Blunt", R.drawable.emily_blunt));
        actors15.add(new Actor("Matt Damon", R.drawable.matt_damon));
        actors15.add(new Actor("Robert Downey Jr.", R.drawable.robert_downey_jr));
        actors15.add(new Actor("Florence Pugh", R.drawable.florence_pugh));
        movies.add(new Movie(
                "Oppenheimer",
                "Biography",
                8.4f,
                "The story follows J. Robert Oppenheimer and the creation of the atomic bomb. It explores science, guilt and power.",
                R.drawable.oppenheimer,
                actors15
        ));

        ArrayList<Actor> actors16 = new ArrayList<>();
        actors16.add(new Actor("Millie Bobby Brown", R.drawable.millie_bobby_brown));
        actors16.add(new Actor("Henry Cavill", R.drawable.henry_cavill));
        actors16.add(new Actor("Sam Claflin", R.drawable.sam_claflin));
        actors16.add(new Actor("Helena Bonham Carter", R.drawable.helena_bonham_carter));
        actors16.add(new Actor("Louis Partridge", R.drawable.louis_partridge));
        movies.add(new Movie(
                "Enola Holmes",
                "Mystery",
                6.6f,
                "Sherlock Holmes' younger sister sets out to find her missing mother. She uncovers clues while proving her own intelligence and bravery.",
                R.drawable.enola_holmes,
                actors16
        ));

        ArrayList<Actor> actors17 = new ArrayList<>();
        actors17.add(new Actor("Daniel Radcliffe", R.drawable.daniel_radcliffe));
        actors17.add(new Actor("Emma Watson", R.drawable.emma_watson));
        actors17.add(new Actor("Rupert Grint", R.drawable.rupert_grint));
        actors17.add(new Actor("Alan Rickman", R.drawable.alan_rickman));
        actors17.add(new Actor("Tom Felton", R.drawable.tom_felton));
        movies.add(new Movie(
                "Harry Potter",
                "Fantasy",
                8.2f,
                "A young wizard discovers his magical past and attends Hogwarts School. He faces danger, friendship and destiny along the way.",
                R.drawable.harry_potter,
                actors17
        ));

        ArrayList<Actor> actors18 = new ArrayList<>();
        actors18.add(new Actor("Jennifer Lawrence", R.drawable.jennifer_lawrence));
        actors18.add(new Actor("Josh Hutcherson", R.drawable.josh_hutcherson));
        actors18.add(new Actor("Liam Hemsworth", R.drawable.liam_hemsworth));
        actors18.add(new Actor("Woody Harrelson", R.drawable.woody_harrelson));
        actors18.add(new Actor("Elizabeth Banks", R.drawable.elizabeth_banks));
        movies.add(new Movie(
                "The Hunger Games",
                "Action",
                7.2f,
                "A teenage girl volunteers in a deadly televised competiton to save her sister. She becomes a symbol of resistance and hope.",
                R.drawable.the_hunger_games,
                actors18
        ));

        ArrayList<Actor> actors19 = new ArrayList<>();
        actors19.add(new Actor("Sandra Bullock", R.drawable.sandra_bullock));
        actors19.add(new Actor("George Clooney", R.drawable.george_clooney));
        actors19.add(new Actor("Ed Harris", R.drawable.ed_harris));
        actors19.add(new Actor("Orto Ignatiussen", R.drawable.orto_ignatiussen));
        actors19.add(new Actor("Phaldut Sharma", R.drawable.phaldut_sharma));
        movies.add(new Movie(
                "Gravity",
                "Thriller",
                7.7f,
                "Two astronauts are stranded in space after debris destroys their shuttle. Survival depends on calm thinking and determination.",
                R.drawable.gravity,
                actors19
        ));

        ArrayList<Actor> actors20 = new ArrayList<>();
        actors20.add(new Actor("Tom Holland", R.drawable.tom_holland));
        actors20.add(new Actor("Zendaya", R.drawable.zendaya));
        actors20.add(new Actor("Benedict Cumberbatch", R.drawable.benedict_cumberbatch));
        actors20.add(new Actor("Jacob Batalon", R.drawable.jacob_batalon));
        actors20.add(new Actor("Marisa Tomei", R.drawable.marisa_tomei));
        movies.add(new Movie(
                "Spider-Man: No Way Home",
                "Superhero",
                8.2f,
                "Peter Parker asks for magical help when his identity is exposed, but everything goes wrong. He must face enemies from other worlds.",
                R.drawable.spiderman,
                actors20
        ));

        return movies;
    }
}
