/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import java.util.function.BiConsumer;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends brt.g<brt.d>
/*     */ {
/*     */   private int b;
/*     */   
/*     */   private static brt.f<d> a(int ☃, BiConsumer<MinecraftServer, d> biConsumer) {
/* 296 */     return new brt.f<>(IntegerArgumentType::integer, f1 -> new d(f1, ☃), biConsumer, brt.c::c, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static brt.f<d> b(int ☃) {
/* 305 */     return a(☃, (☃, d1) -> {
/*     */         
/*     */         });
/*     */   }
/*     */   
/*     */   public d(brt.f<d> ☃, int i) {
/* 311 */     super(☃);
/* 312 */     this.b = i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(CommandContext<db> ☃, String str) {
/* 317 */     this.b = IntegerArgumentType.getInteger(☃, str);
/*     */   }
/*     */   
/*     */   public int a() {
/* 321 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 331 */     return Integer.toString(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃) {
/* 336 */     this.b = c(☃);
/*     */   }
/*     */   
/*     */   public boolean b(String ☃) {
/*     */     try {
/* 341 */       this.b = Integer.parseInt(☃);
/* 342 */       return true;
/* 343 */     } catch (NumberFormatException numberFormatException) {
/*     */ 
/*     */       
/* 346 */       return false;
/*     */     } 
/*     */   }
/*     */   private static int c(String ☃) {
/* 350 */     if (!☃.isEmpty()) {
/*     */       try {
/* 352 */         return Integer.parseInt(☃);
/* 353 */       } catch (NumberFormatException numberFormatException) {
/* 354 */         brt.c().warn("Failed to parse integer {}", ☃);
/*     */       } 
/*     */     }
/* 357 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 362 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected d d() {
/* 367 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected d e() {
/* 372 */     return new d(this.a, this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(d ☃, @Nullable MinecraftServer minecraftServer) {
/* 377 */     this.b = ☃.b;
/* 378 */     a(minecraftServer);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brt$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */