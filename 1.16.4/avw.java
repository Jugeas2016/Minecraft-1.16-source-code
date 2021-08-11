/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.EnumMap;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avw
/*     */ {
/*  17 */   private static final Logger a = LogManager.getLogger();
/*  18 */   private static final axl b = new axl(2147483647, new avv()
/*     */       {
/*     */         public boolean a() {
/*  21 */           return false;
/*     */         }
/*     */       })
/*     */     {
/*     */       public boolean g() {
/*  26 */         return false;
/*     */       }
/*     */     };
/*     */   
/*  30 */   private final Map<avv.a, axl> c = new EnumMap<>(avv.a.class);
/*  31 */   private final Set<axl> d = Sets.newLinkedHashSet();
/*     */   private final Supplier<anw> e;
/*  33 */   private final EnumSet<avv.a> f = EnumSet.noneOf(avv.a.class);
/*     */   
/*  35 */   private int g = 3;
/*     */   
/*     */   public avw(Supplier<anw> ☃) {
/*  38 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, avv avv1) {
/*  46 */     this.d.add(new axl(☃, avv1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(avv ☃) {
/*  55 */     this.d.stream().filter(axl1 -> (axl1.j() == ☃)).filter(axl::g).forEach(axl::d);
/*  56 */     this.d.removeIf(axl1 -> (axl1.j() == ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  61 */     anw ☃ = this.e.get();
/*  62 */     ☃.a("goalCleanup");
/*  63 */     d().filter(☃ -> (!☃.g() || ☃.i().stream().anyMatch(this.f::contains) || !☃.b())).forEach(avv::d);
/*  64 */     this.c.forEach((☃, axl1) -> {
/*     */           if (!axl1.g()) {
/*     */             this.c.remove(☃);
/*     */           }
/*     */         });
/*  69 */     ☃.c();
/*     */     
/*  71 */     ☃.a("goalUpdate");
/*  72 */     this.d.stream()
/*  73 */       .filter(☃ -> !☃.g())
/*  74 */       .filter(☃ -> ☃.i().stream().noneMatch(this.f::contains))
/*  75 */       .filter(☃ -> ☃.i().stream().allMatch(()))
/*  76 */       .filter(axl::a)
/*  77 */       .forEach(☃ -> {
/*     */           ☃.i().forEach(());
/*     */ 
/*     */           
/*     */           ☃.c();
/*     */         });
/*     */ 
/*     */     
/*  85 */     ☃.c();
/*     */     
/*  87 */     ☃.a("goalTick");
/*  88 */     d().forEach(axl::e);
/*  89 */     ☃.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Stream<axl> d() {
/*  97 */     return this.d.stream().filter(axl::g);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(avv.a ☃) {
/* 105 */     this.f.add(☃);
/*     */   }
/*     */   
/*     */   public void b(avv.a ☃) {
/* 109 */     this.f.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(avv.a ☃, boolean bool) {
/* 113 */     if (bool) {
/* 114 */       b(☃);
/*     */     } else {
/* 116 */       a(☃);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */