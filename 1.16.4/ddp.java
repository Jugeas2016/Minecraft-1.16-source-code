/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
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
/*    */ public abstract class ddp
/*    */ {
/*    */   public boolean a(@Nullable ddp ☃) {
/* 16 */     if (☃ == null) {
/* 17 */       return false;
/*    */     }
/* 19 */     if (this == ☃) {
/* 20 */       return true;
/*    */     }
/* 22 */     return false;
/*    */   }
/*    */   
/*    */   public abstract String b();
/*    */   
/*    */   public abstract nx d(nr paramnr);
/*    */   
/*    */   public abstract boolean i();
/*    */   
/*    */   public abstract boolean h();
/*    */   
/*    */   public abstract b j();
/*    */   
/*    */   public abstract k n();
/*    */   
/*    */   public abstract Collection<String> g();
/*    */   
/*    */   public abstract b k();
/*    */   
/*    */   public abstract a l();
/*    */   
/*    */   public enum b {
/* 44 */     a("always", 0),
/* 45 */     b("never", 1),
/* 46 */     c("hideForOtherTeams", 2),
/* 47 */     d("hideForOwnTeam", 3);
/*    */     static {
/* 49 */       g = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(☃ -> ☃.e, ☃ -> ☃));
/*    */     }
/*    */     private static final Map<String, b> g;
/*    */     public final String e;
/*    */     public final int f;
/*    */     
/*    */     @Nullable
/*    */     public static b a(String ☃) {
/* 57 */       return g.get(☃);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     b(String ☃, int i) {
/* 64 */       this.e = ☃;
/* 65 */       this.f = i;
/*    */     }
/*    */     
/*    */     public nr b() {
/* 69 */       return new of("team.visibility." + this.e);
/*    */     }
/*    */   }
/*    */   
/*    */   public enum a {
/* 74 */     a("always", 0),
/* 75 */     b("never", 1),
/* 76 */     c("pushOtherTeams", 2),
/* 77 */     d("pushOwnTeam", 3); private static final Map<String, a> g;
/*    */     static {
/* 79 */       g = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(☃ -> ☃.e, ☃ -> ☃));
/*    */     }
/*    */     
/*    */     public final String e;
/*    */     public final int f;
/*    */     
/*    */     @Nullable
/*    */     public static a a(String ☃) {
/* 87 */       return g.get(☃);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     a(String ☃, int i) {
/* 94 */       this.e = ☃;
/* 95 */       this.f = i;
/*    */     }
/*    */     
/*    */     public nr b() {
/* 99 */       return new of("team.collision." + this.e);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */