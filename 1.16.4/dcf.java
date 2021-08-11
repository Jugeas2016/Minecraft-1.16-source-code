/*     */ import com.google.common.collect.HashBasedTable;
/*     */ import com.google.common.collect.Table;
/*     */ import com.google.common.primitives.UnsignedLong;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.PriorityQueue;
/*     */ import java.util.Queue;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Stream;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dcf<T>
/*     */ {
/*  22 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final dce<T> b;
/*     */   
/*     */   public static class a<T>
/*     */   {
/*     */     public final long a;
/*     */     public final UnsignedLong b;
/*     */     public final String c;
/*     */     public final dcd<T> d;
/*     */     
/*     */     private a(long ☃, UnsignedLong unsignedLong, String str, dcd<T> dcd1) {
/*  34 */       this.a = ☃;
/*  35 */       this.b = unsignedLong;
/*  36 */       this.c = str;
/*  37 */       this.d = dcd1;
/*     */     }
/*     */   }
/*     */   
/*     */   private static <T> Comparator<a<T>> c() {
/*  42 */     return Comparator.comparingLong(☃ -> ☃.a).thenComparing(☃ -> ☃.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  47 */   private final Queue<a<T>> c = new PriorityQueue<>((Comparator)c());
/*     */   
/*  49 */   private UnsignedLong d = UnsignedLong.ZERO;
/*     */   
/*  51 */   private final Table<String, Long, a<T>> e = (Table<String, Long, a<T>>)HashBasedTable.create();
/*     */   
/*     */   public dcf(dce<T> ☃, Stream<Dynamic<mt>> stream) {
/*  54 */     this(☃);
/*  55 */     this.c.clear();
/*  56 */     this.e.clear();
/*  57 */     this.d = UnsignedLong.ZERO;
/*     */     
/*  59 */     stream.forEach(☃ -> {
/*     */           if (!(☃.getValue() instanceof md)) {
/*     */             a.warn("Invalid format of events: {}", ☃);
/*     */             return;
/*     */           } 
/*     */           a((md)☃.getValue());
/*     */         });
/*     */   }
/*     */   
/*     */   public dcf(dce<T> ☃) {
/*  69 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a(T ☃, long l) {
/*     */     while (true) {
/*  74 */       a<T> a = this.c.peek();
/*  75 */       if (a == null || a.a > l) {
/*     */         break;
/*     */       }
/*     */       
/*  79 */       this.c.remove();
/*  80 */       this.e.remove(a.c, Long.valueOf(l));
/*     */       
/*  82 */       a.d.a(☃, this, l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃, long l, dcd<T> dcd1) {
/*  87 */     if (this.e.contains(☃, Long.valueOf(l))) {
/*     */       return;
/*     */     }
/*  90 */     this.d = this.d.plus(UnsignedLong.ONE);
/*  91 */     a<T> a = new a<>(l, this.d, ☃, dcd1);
/*  92 */     this.e.put(☃, Long.valueOf(l), a);
/*  93 */     this.c.add(a);
/*     */   }
/*     */   
/*     */   public int a(String ☃) {
/*  97 */     Collection<a<T>> collection = this.e.row(☃).values();
/*  98 */     collection.forEach(this.c::remove);
/*  99 */     int i = collection.size();
/* 100 */     collection.clear();
/* 101 */     return i;
/*     */   }
/*     */   
/*     */   public Set<String> a() {
/* 105 */     return Collections.unmodifiableSet(this.e.rowKeySet());
/*     */   }
/*     */   
/*     */   private void a(md ☃) {
/* 109 */     md md1 = ☃.p("Callback");
/* 110 */     dcd<T> dcd = this.b.a(md1);
/* 111 */     if (dcd != null) {
/* 112 */       String str = ☃.l("Name");
/* 113 */       long l = ☃.i("TriggerTime");
/* 114 */       a(str, l, dcd);
/*     */     } 
/*     */   }
/*     */   
/*     */   private md a(a<T> ☃) {
/* 119 */     md md = new md();
/* 120 */     md.a("Name", ☃.c);
/* 121 */     md.a("TriggerTime", ☃.a);
/* 122 */     md.a("Callback", this.b.a(☃.d));
/* 123 */     return md;
/*     */   }
/*     */   
/*     */   public mj b() {
/* 127 */     mj ☃ = new mj();
/* 128 */     this.c.stream().sorted(c()).map(this::a).forEach(☃::add);
/* 129 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */