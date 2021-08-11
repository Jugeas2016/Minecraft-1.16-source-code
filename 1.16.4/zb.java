/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Locale;
/*    */ import java.util.UUID;
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
/*    */ public class zb
/*    */   implements yz
/*    */ {
/* 27 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.data.entity.invalid")); public static final Function<String, za.c> a;
/*    */   static {
/* 29 */     a = (☃ -> new za.c(☃)
/*    */       {
/*    */         public yz a(CommandContext<db> ☃) throws CommandSyntaxException {
/* 32 */           return new zb(dk.a(☃, this.a));
/*    */         }
/*    */ 
/*    */         
/*    */         public ArgumentBuilder<db, ?> a(ArgumentBuilder ☃, Function function) {
/* 37 */           return ☃.then(dc.a("entity").then((ArgumentBuilder)function.apply(dc.a(this.a, dk.a()))));
/*    */         }
/*    */       });
/*    */   }
/*    */   private final aqa c;
/*    */   
/*    */   public zb(aqa ☃) {
/* 44 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) throws CommandSyntaxException {
/* 49 */     if (this.c instanceof bfw) {
/* 50 */       throw b.create();
/*    */     }
/* 52 */     UUID uUID = this.c.bS();
/* 53 */     this.c.f(☃);
/* 54 */     this.c.a_(uUID);
/*    */   }
/*    */ 
/*    */   
/*    */   public md a() {
/* 59 */     return cb.b(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public nr b() {
/* 64 */     return new of("commands.data.entity.modified", new Object[] { this.c.d() });
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(mt ☃) {
/* 69 */     return new of("commands.data.entity.query", new Object[] { this.c.d(), ☃.l() });
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(dr.h ☃, double d, int i) {
/* 74 */     return new of("commands.data.entity.get", new Object[] { ☃, this.c.d(), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d) }), Integer.valueOf(i) });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */