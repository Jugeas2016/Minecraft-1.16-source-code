/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class ex
/*    */   implements Predicate<bmb>
/*    */ {
/*    */   private static final Dynamic2CommandExceptionType a;
/*    */   private final blx b;
/*    */   @Nullable
/*    */   private final md c;
/*    */   
/*    */   static {
/* 16 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new of("arguments.item.overstacked", new Object[] { ☃, object1 }));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ex(blx ☃, @Nullable md md1) {
/* 23 */     this.b = ☃;
/* 24 */     this.c = md1;
/*    */   }
/*    */   
/*    */   public blx a() {
/* 28 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃) {
/* 38 */     return (☃.b() == this.b && mp.a(this.c, ☃.o(), true));
/*    */   }
/*    */   
/*    */   public bmb a(int ☃, boolean bool) throws CommandSyntaxException {
/* 42 */     bmb bmb = new bmb(this.b, ☃);
/* 43 */     if (this.c != null) {
/* 44 */       bmb.c(this.c);
/*    */     }
/* 46 */     if (bool && ☃ > bmb.c()) {
/* 47 */       throw a.create(gm.T.b(this.b), Integer.valueOf(bmb.c()));
/*    */     }
/* 49 */     return bmb;
/*    */   }
/*    */   
/*    */   public String c() {
/* 53 */     StringBuilder ☃ = new StringBuilder(gm.T.a(this.b));
/* 54 */     if (this.c != null) {
/* 55 */       ☃.append(this.c);
/*    */     }
/* 57 */     return ☃.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */