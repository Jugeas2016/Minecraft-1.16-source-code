/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Locale;
/*    */ import java.util.function.Function;
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
/*    */ public class yy
/*    */   implements yz
/*    */ {
/*    */   public static final Function<String, za.c> a;
/* 27 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.data.block.invalid"));
/*    */   static {
/* 29 */     a = (☃ -> new za.c(☃)
/*    */       {
/*    */         public yz a(CommandContext<db> ☃) throws CommandSyntaxException {
/* 32 */           fx fx = ek.a(☃, this.a + "Pos");
/* 33 */           ccj ccj = ((db)☃.getSource()).e().c(fx);
/* 34 */           if (ccj == null) {
/* 35 */             throw yy.c().create();
/*    */           }
/* 37 */           return new yy(ccj, fx);
/*    */         }
/*    */ 
/*    */         
/*    */         public ArgumentBuilder<db, ?> a(ArgumentBuilder ☃, Function function) {
/* 42 */           return ☃.then(dc.a("block").then((ArgumentBuilder)function.apply(dc.a(this.a + "Pos", ek.a()))));
/*    */         }
/*    */       });
/*    */   }
/*    */   private final ccj c;
/*    */   private final fx d;
/*    */   
/*    */   public yy(ccj ☃, fx fx1) {
/* 50 */     this.c = ☃;
/* 51 */     this.d = fx1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) {
/* 56 */     ☃.b("x", this.d.u());
/* 57 */     ☃.b("y", this.d.v());
/* 58 */     ☃.b("z", this.d.w());
/* 59 */     ceh ceh = this.c.v().d_(this.d);
/* 60 */     this.c.a(ceh, ☃);
/* 61 */     this.c.X_();
/* 62 */     this.c.v().a(this.d, ceh, ceh, 3);
/*    */   }
/*    */ 
/*    */   
/*    */   public md a() {
/* 67 */     return this.c.a(new md());
/*    */   }
/*    */ 
/*    */   
/*    */   public nr b() {
/* 72 */     return new of("commands.data.block.modified", new Object[] { Integer.valueOf(this.d.u()), Integer.valueOf(this.d.v()), Integer.valueOf(this.d.w()) });
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(mt ☃) {
/* 77 */     return new of("commands.data.block.query", new Object[] { Integer.valueOf(this.d.u()), Integer.valueOf(this.d.v()), Integer.valueOf(this.d.w()), ☃.l() });
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(dr.h ☃, double d, int i) {
/* 82 */     return new of("commands.data.block.get", new Object[] { ☃, Integer.valueOf(this.d.u()), Integer.valueOf(this.d.v()), Integer.valueOf(this.d.w()), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d) }), Integer.valueOf(i) });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */