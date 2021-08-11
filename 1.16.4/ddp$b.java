/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum b
/*    */ {
/* 44 */   a("always", 0),
/* 45 */   b("never", 1),
/* 46 */   c("hideForOtherTeams", 2),
/* 47 */   d("hideForOwnTeam", 3);
/*    */   static {
/* 49 */     g = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(☃ -> ☃.e, ☃ -> ☃));
/*    */   }
/*    */   private static final Map<String, b> g;
/*    */   public final String e;
/*    */   public final int f;
/*    */   
/*    */   @Nullable
/*    */   public static b a(String ☃) {
/* 57 */     return g.get(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   b(String ☃, int i) {
/* 64 */     this.e = ☃;
/* 65 */     this.f = i;
/*    */   }
/*    */   
/*    */   public nr b() {
/* 69 */     return new of("team.visibility." + this.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddp$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */