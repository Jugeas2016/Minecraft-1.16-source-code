/*    */ import com.google.gson.JsonElement;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.function.Function;
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
/*    */ public class d
/*    */   extends bz<Integer>
/*    */ {
/* 21 */   public static final d e = new d(null, null); private final Long f;
/*    */   
/*    */   private static d a(StringReader ☃, @Nullable Integer integer1, @Nullable Integer integer2) throws CommandSyntaxException {
/* 24 */     if (integer1 != null && integer2 != null && integer1.intValue() > integer2.intValue()) {
/* 25 */       throw b.createWithContext(☃);
/*    */     }
/*    */     
/* 28 */     return new d(integer1, integer2);
/*    */   }
/*    */   private final Long g;
/*    */   @Nullable
/*    */   private static Long a(@Nullable Integer ☃) {
/* 33 */     return (☃ == null) ? null : Long.valueOf(☃.longValue() * ☃.longValue());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private d(@Nullable Integer ☃, @Nullable Integer integer1) {
/* 40 */     super(☃, integer1);
/* 41 */     this.f = a(☃);
/* 42 */     this.g = a(integer1);
/*    */   }
/*    */   
/*    */   public static d a(int ☃) {
/* 46 */     return new d(Integer.valueOf(☃), Integer.valueOf(☃));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static d b(int ☃) {
/* 54 */     return new d(Integer.valueOf(☃), null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean d(int ☃) {
/* 62 */     if (this.c != null && this.c.intValue() > ☃) {
/* 63 */       return false;
/*    */     }
/* 65 */     if (this.d != null && this.d.intValue() < ☃) {
/* 66 */       return false;
/*    */     }
/* 68 */     return true;
/*    */   }
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
/*    */   public static d a(@Nullable JsonElement ☃) {
/* 82 */     return (d)a(☃, e, afd::g, d::new);
/*    */   }
/*    */   
/*    */   public static d a(StringReader ☃) throws CommandSyntaxException {
/* 86 */     return a(☃, ☃ -> ☃);
/*    */   }
/*    */   
/*    */   public static d a(StringReader ☃, Function<Integer, Integer> function) throws CommandSyntaxException {
/* 90 */     return (d)a(☃, d::a, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, function);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bz$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */