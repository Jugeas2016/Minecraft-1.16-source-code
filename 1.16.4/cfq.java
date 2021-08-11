/*    */ import it.unimi.dsi.fastutil.objects.ObjectArraySet;
/*    */ import java.util.Set;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cfq
/*    */ {
/*  9 */   private static final Set<cfq> i = (Set<cfq>)new ObjectArraySet();
/*    */   
/* 11 */   public static final cfq a = a(new cfq("oak"));
/* 12 */   public static final cfq b = a(new cfq("spruce"));
/* 13 */   public static final cfq c = a(new cfq("birch"));
/* 14 */   public static final cfq d = a(new cfq("acacia"));
/* 15 */   public static final cfq e = a(new cfq("jungle"));
/* 16 */   public static final cfq f = a(new cfq("dark_oak"));
/* 17 */   public static final cfq g = a(new cfq("crimson"));
/* 18 */   public static final cfq h = a(new cfq("warped"));
/*    */   
/*    */   private final String j;
/*    */   
/*    */   protected cfq(String ☃) {
/* 23 */     this.j = ☃;
/*    */   }
/*    */   
/*    */   private static cfq a(cfq ☃) {
/* 27 */     i.add(☃);
/* 28 */     return ☃;
/*    */   }
/*    */   
/*    */   public static Stream<cfq> a() {
/* 32 */     return i.stream();
/*    */   }
/*    */   
/*    */   public String b() {
/* 36 */     return this.j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */